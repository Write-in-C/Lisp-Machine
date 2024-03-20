package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
import antlr.ClojureParser;
import antlr.ClojureParser.ArgumentsContext;
import antlr.ClojureParser.CallContext;
import antlr.ClojureParser.DefnContext;
import antlr.ClojureParser.DefnIDContext;
import antlr.ClojureParser.ExpressionContext;
import antlr.ClojureParser.ExpressionsContext;
import antlr.ClojureParser.IfContext;
import antlr.ClojureParser.ParametersContext;
import antlr.ClojureParser.ProgramContext;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import ru.nsu.valikov.compiler.Scopes;
import ru.nsu.valikov.generators.Expression.TYPE;
import ru.nsu.valikov.generators.Expression.TYPE.FUNCTION_TYPE;

public class TranslationVisitor extends ClojureBaseVisitor<List<Expression>> {

    String file;
    StringBuilder mem = new StringBuilder();
    boolean shouldPrint = false;

    private static final Map<String, List<Expression>> functions = new HashMap<>();

    static {
        Scopes.createNew();
        Scopes.defineNewVariable("lisp_eq_int",
                new Expression(TYPE.FUNCTION, "lisp_eq_int", FUNCTION_TYPE.BOOLEAN));
        Scopes.defineNewVariable("lisp_leq_int",
                new Expression(TYPE.FUNCTION, "lisp_leq_int", FUNCTION_TYPE.BOOLEAN));
        Scopes.defineNewVariable("lisp_mul_int",
                new Expression(TYPE.FUNCTION, "lisp_mul_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_div_int",
                new Expression(TYPE.FUNCTION, "lisp_div_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_sub_int",
                new Expression(TYPE.FUNCTION, "lisp_sub_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_add_int",
                new Expression(TYPE.FUNCTION, "lisp_add_int", FUNCTION_TYPE.INT));
        functions.put("lisp_eq_int", List.of());
        functions.put("lisp_leq_int", List.of());
        functions.put("lisp_mul_int", List.of());
        functions.put("lisp_div_int", List.of());
        functions.put("lisp_sub_int", List.of());
        functions.put("lisp_add_int", List.of());
    }

    @Override
    public List<Expression> visitProgram(ProgramContext ctx) {

        file = "out/" + ctx.filename().IDENT().getText() + ".c";
        try (InputStreamReader stream = new InputStreamReader(
                Objects.requireNonNull(getClass().getResourceAsStream("/c-utils/includes.c")))) {
            var buffer = new char[1024];
            var read = 0;
            while ((read = stream.read(buffer)) != -1) {
                mem.append(buffer, 0, read);
            }
        } catch (IOException e) {
            System.err.println("unable to read file");
            System.err.println(e.getMessage());
        }
        super.visitProgram(ctx);
        try (var writer = new PrintWriter(file)) {
            writer.println(mem);
        } catch (IOException e) {
            System.err.println("unable to write file");
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Expression> visitIf(IfContext ctx) {
        Scopes.createNew();

        var pseudo = new StringBuilder();

        var if_ = visitIfBody(ctx.ifBody()).getLast().buffer;
        pseudo.append(if_);

        pseudo.append(" ? ");

        var then = visitThen(ctx.then());
        var last = then.getLast();
        pseudo.append(last.buffer);
        pseudo.append(" : ");

        var els = visitElse(ctx.else_());
        last = els.getLast();
        pseudo.append(last.buffer);

        Scopes.deleteLast();
        var exp = new Expression(TYPE.NONE);
        exp.buffer = pseudo;

        return List.of(exp);
    }

    List<Integer> innerCallDepth = new ArrayList<>();

    @Override
    public List<Expression> visitLet(ClojureParser.LetContext ctx) {
        var params = ctx.parameter();
        var exprs = ctx.expression();
        var body = ctx.body;

        var pseudo = new StringBuilder();

        for (int i = 0; i < params.size(); i++) {
            var p = visitParameter(params.get(i)).getLast();
            var e = visitExpression(exprs.get(i)).getLast();

            if (e.type == TYPE.INT) {
                Scopes.setIntValue(p.buffer.toString().split(" ")[1], Integer.parseInt(e.value)); // костылек
            }
            pseudo.append(p.buffer).append(" = ").append(e.buffer).append(";\n");
        }

        pseudo.append(visitExpression(body));
        var exp = new Expression(TYPE.NONE);
        exp.buffer = pseudo;
        return List.of(exp);
    }

    @Override
    public List<Expression> visitCall(CallContext ctx) {
        var n = innerCallDepth.size() - 1;
        innerCallDepth.set(n, innerCallDepth.get(n) + 1);
        var arguments = visitArguments(ctx.arguments());
        var defaultPrefix = "";
        if (arguments.stream()
                .allMatch(i -> i.type == TYPE.INT || i.functionType == FUNCTION_TYPE.INT)) {
            defaultPrefix = "_int";
        }

        var fName = ctx.ident().getText();
        var buffer = new StringBuilder();

        switch (fName) {
            case "=" -> {
                fName = "lisp_eq%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            case "<=" -> {
                fName = "lisp_leq%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            case "-" -> {
                fName = "lisp_sub%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            case "+" -> {
                fName = "lisp_add%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            case "*" -> {
                fName = "lisp_mul%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            case "/" -> {
                fName = "lisp_div%s".formatted(defaultPrefix);
                buffer.append(fName);
            }
            default -> {
                if (functions.containsKey(fName)) {
                    buffer.append(fName);
                    break;
                }

                throw new RuntimeException("Should not reach here: " + ctx.ident().getText());
            }
        }

        buffer.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(arguments.get(i).buffer);
        }
        buffer.append(")");

        var response = new Expression(TYPE.NONE, "");
        response.buffer = buffer;
        innerCallDepth.set(n, innerCallDepth.get(n) - 1);
        if (innerCallDepth.get(n) == 0) {
            System.out.println(buffer);
            innerCallDepth.remove(n);
        }
        return List.of(response);
    }

    @Override
    public List<Expression> visitExpressions(ExpressionsContext ctx) {
        List<Expression> list = new ArrayList<>();
        System.out.println(ctx.expression().getLast().getText());
        ctx.expression()
                .forEach(exp -> list.addAll(visitExpression(exp)));
        return list;
    }

    @Override
    public List<Expression> visitExpression(ExpressionContext ctx) {

        if (ctx.call() != null) {
            if (innerCallDepth.isEmpty()) {
                innerCallDepth.add(0);
            }
            return visitCall(ctx.call());
        }

        if (ctx.atom() != null) {
            if (ctx.atom().number() != null) {
                var r = new Expression(Expression.TYPE.INT,
                        ctx.atom().number().getText());
                r.buffer.append(ctx.atom().getText());
                return List.of(r);
            }
            if (ctx.atom().ident() != null) {
                var r = Scopes.get(ctx.atom().ident().getText());
//                r.buffer.append(r.value);
                return List.of(r);
            }
            return visitAtom(ctx.atom());
        }
        if (ctx.list() != null) {
            return visitList(ctx.list());
        }
        if (ctx.if_() != null) {
            return visitIf(ctx.if_());
        }
        if (ctx.defn() != null) {
            visitDefn(ctx.defn());
        }

        if (ctx.let() != null) {
            return visitLet(ctx.let());
        }

        return List.of(new Expression(TYPE.NONE, ""));
    }

    @Override
    public List<Expression> visitParameter(ClojureParser.ParameterContext ctx) {
        var argName = ctx.ident().getText();
        var argType = Expression.exprByHint(ctx.hint().getText(), false);
        var n = Expression.exprByHint(ctx.hint().getText(), false);
        n.buffer.append(argName);
        Scopes.defineNewVariable(argName, n);
        argType.buffer.append(argType.getFunctionType()).append(" ").append(argName);
        return List.of(argType);
    }

    @Override
    public List<Expression> visitParameters(ParametersContext ctx) {
        var pseudo = new StringBuilder();

        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (i > 0) {
                pseudo.append(", ");
            }
            var param = visitParameter(ctx.parameter(i)).getLast().buffer;
            pseudo.append(param);
        }

        var exp = new Expression(TYPE.NONE);
        exp.buffer = pseudo;
        return List.of(exp);
    }

    @Override
    public List<Expression> visitDefnID(DefnIDContext ctx) {
        var name = ctx.ident().getText();
        functions.put(name, List.of());

        var funcExpr = Expression.exprByHint(ctx.hint().getText(), true);
        Scopes.defineNewVariable(name, funcExpr);

        var pseudo = new StringBuilder();
        pseudo.append(funcExpr.getFunctionType()).append(" ")
                .append(name);
        var exp = new Expression(TYPE.NONE);
        exp.buffer = pseudo;

        return List.of(exp);
    }

    @Override
    public List<Expression> visitArguments(ArgumentsContext ctx) {
        List<Expression> list = new ArrayList<>();
        ctx.expression()
                .forEach(exp -> list.addAll(visitExpression(exp)));
        return list;
    }

    @Override
    public List<Expression> visitDefn(DefnContext ctx) {

        var signature = visitDefnID(ctx.defnID()).getLast().buffer;

        Scopes.createNew();
        var params = visitParameters(ctx.parameters()).getLast().buffer;
        var body = visitExpressions(ctx.expressions());

        mem.append(signature).append("(").append(params).append(")").append(" {\n");

        for (int i = 0; i < body.size() - 1; i++) {
            mem.append(body.get(i).buffer).append(";");
        }
        mem.append("    return ");
        mem.append(body.getLast().buffer);
        shouldPrint = true;
        mem.append(";");
        mem.append("\n}\n");
        Scopes.deleteLast();
        return null;
    }
}
