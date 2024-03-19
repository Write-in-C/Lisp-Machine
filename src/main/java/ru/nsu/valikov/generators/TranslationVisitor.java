package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
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

        visitIfBody(ctx.ifBody());
        mem.append(" ? ");

        var then = visitThen(ctx.then());
        var last = then.getLast();
        if (last.type != TYPE.FUNCTION) {
            mem.append(last.value);
        }
        mem.append(" : ");

        var els = visitElse(ctx.else_());
        last = els.getLast();
        if (last.type != TYPE.FUNCTION) {
            mem.append(last.value);
        }

        Scopes.deleteLast();
        return List.of(last);
    }

    List<Integer> innerCallDepth = new ArrayList<>();

//    @Override
//    public List<Expression> visitLet(ClojureParser.LetContext ctx) {
//        var id=ctx.ident();
//        var type=Expression.exprByHint(ctx.hint().getText(), false);
//
//
//    }

    @Override
    public List<Expression> visitCall(CallContext ctx) {
        var n = innerCallDepth.size() - 1;
        innerCallDepth.set(n, innerCallDepth.get(n) + 1);
        var arguments = visitArguments(ctx.arguments());
//        System.out.println(arguments.stream().map(im-> im.buffer).toList());
        var defaultPrefix = "";
        var defaultType = FUNCTION_TYPE.NOT_A_FUNCTION;
        if (arguments.stream()
                .allMatch(i -> i.type == TYPE.INT || i.functionType == FUNCTION_TYPE.INT)) {
            defaultPrefix = "_int";
            defaultType = FUNCTION_TYPE.INT;
        }

        var fName = ctx.ident().getText();
        var buffer = new StringBuilder();

        switch (fName) {
            case "=" -> {
                fName = "lisp_eq%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    FUNCTION_TYPE.BOOLEAN));
            }
            case "<=" -> {
                fName = "lisp_leq%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    FUNCTION_TYPE.BOOLEAN));
            }
            case "-" -> {
                fName = "lisp_sub%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    defaultType));
            }
            case "+" -> {
                fName = "lisp_add%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    defaultType));
            }
            case "*" -> {
                fName = "lisp_mul%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    defaultType));
            }
            case "/" -> {
                fName = "lisp_div%s".formatted(defaultPrefix);
                buffer.append(fName);
//                yield List.of(new Expression(TYPE.FUNCTION, fName,
//                    defaultType));
            }
            default -> {
                if (functions.containsKey(fName)) {
                    buffer.append(fName);
                    break;
//                    yield List.of(
//                        new Expression(TYPE.FUNCTION, fName, Scopes.get(fName).functionType));
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
//        response.buffer = buffer;
        innerCallDepth.set(n, innerCallDepth.get(n) - 1);
        if (innerCallDepth.get(n) == 0) {
//            System.out.println(buffer);
            mem.append(buffer);
            innerCallDepth.remove(n);
        }
        return List.of(response);
    }

    @Override
    public List<Expression> visitExpressions(ExpressionsContext ctx) {
        List<Expression> list = new ArrayList<>();
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

        return List.of(new Expression(TYPE.NONE, ""));
    }

    @Override
    public List<Expression> visitParameters(ParametersContext ctx) {
        List<Expression> argTypes = new ArrayList<>();
        mem.append("(");

        for (int i = 0; i < ctx.hint().size(); i++) {
            if (i > 0) {
                mem.append(", ");
            }
            var argName = ctx.ident(i).getText();
            var argType = Expression.exprByHint(ctx.hint(i).getText(), false);
            argType.buffer.append(argName);
            Scopes.defineNewVariable(argName, argType);
            argTypes.add(argType);
            mem.append(argType.getFunctionType()).append(" ")
                    .append(argName);
        }

        mem.append(")");

        return argTypes;
    }

    @Override
    public List<Expression> visitDefnID(DefnIDContext ctx) {
        var name = ctx.ident().getText();
        functions.put(name, List.of());

        var funcExpr = Expression.exprByHint(ctx.hint().getText(), true);
        Scopes.defineNewVariable(name, funcExpr);

        mem.append(funcExpr.getFunctionType()).append(" ")
                .append(name);

        return List.of(funcExpr);
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

        visitDefnID(ctx.defnID());

        Scopes.createNew();
        visitParameters(ctx.parameters());

        mem.append(" {\n    return ");
        shouldPrint = true;
        visitExpressions(ctx.expressions());
        mem.append(";");
        mem.append("\n}\n");
        Scopes.deleteLast();
        return null;
    }
}
