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
import java.util.List;
import java.util.Objects;

import ru.nsu.valikov.compiler.Scopes;
import ru.nsu.valikov.compiler.Utils;
import ru.nsu.valikov.generators.Expression.TYPE;
import ru.nsu.valikov.generators.Expression.TYPE.FUNCTION_TYPE;

public class TranslationVisitor extends ClojureBaseVisitor<List<Expression>> {

    String file;
    StringBuilder top = new StringBuilder();
    StringBuilder bot = new StringBuilder();


    static {
        Scopes.createNew();
        Scopes.defineNewVariable("lisp_eq", "lisp_eq");
        Scopes.defineNewVariable("lisp_leq", "lisp_leq");
        Scopes.defineNewVariable("lisp_mul", "lisp_mul");
        Scopes.defineNewVariable("lisp_div", "lisp_div");
        Scopes.defineNewVariable("lisp_sub", "lisp_sub");
        Scopes.defineNewVariable("lisp_add", "lisp_add");
        Scopes.defineNewVariable("lisp_printf", "lisp_printf");
        Scopes.defineNewVariable("lisp_list_fst", "lisp_list_fst");
        Scopes.defineNewVariable("lisp_list_snd", "lisp_list_snd");

        Scopes.functions.put("lisp_eq", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_leq", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_mul", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_div", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_sub", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_add", "(Object (*) (Object, Object))");
        Scopes.functions.put("lisp_printf", "(Object (*) (Object))");
        Scopes.functions.put("lisp_list_fst", "(Object (*) (Object))");
        Scopes.functions.put("lisp_list_snd", "(Object (*) (Object))");
    }

    @Override
    public List<Expression> visitProgram(ProgramContext ctx) {

        file = "out/" + ctx.filename().IDENT().getText() + ".c";
        try (InputStreamReader stream = new InputStreamReader(
                Objects.requireNonNull(getClass().getResourceAsStream("/c-utils/includes.c")))) {
            var buffer = new char[1024];
            var read = 0;
            while ((read = stream.read(buffer)) != -1) {
                bot.append(buffer, 0, read);
            }
        } catch (IOException e) {
            System.err.println("unable to read file");
            System.err.println(e.getMessage());
        }
        visitFilename(ctx.filename());
        var exprs = visitExpressions(ctx.expressions());
        bot.append(top);
        for (var expr : exprs) {
            if (expr.type == TYPE.FUNCTION) bot.append(expr.buffer);
        }
        bot.append("\nint main() {\n    nil.t = NIL;\n");
        for (var expr : exprs) {
            if (expr.type != TYPE.FUNCTION) {
                bot.append("    ").append(expr.buffer).append(";\n");
            }
        }
        bot.append("    return 0;\n}\n");
        try (var writer = new PrintWriter(file)) {
            writer.println(bot);
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

        var if_ = visitIfBody(ctx.ifBody()).getLast().buffer.append(".b.v == 1");
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
        var ident = ctx.ident().getText();
        var nident = ident + Utils.getIdForLambda();
        Scopes.defineNewVariable(ident, nident);
        Scopes.defineNewVariable(nident, nident);
        var expr = visitExpression(ctx.expression(0)).getLast();
        if (expr.type == TYPE.FUNCTION) {
            var params = expr.buffer.toString().lines().findFirst().get();
            var p = new StringBuilder("Object (*) (");
            var c = params.toString().split("Object", -1).length - 1;
            for (int i = 0; i < c; i++) {
                if (i > 0) p.append(",");
                p.append("Object");
            }
            p.append(")");
            Scopes.functions.put(nident, p.toString());
//            System.out.println(p);
        }
        var body = visitExpression(ctx.body).getLast();
        if (expr.type == TYPE.FUNCTION) {
            top.append("Object ").append(nident).append(expr.buffer).append("\n");
            return List.of(new Expression(body.buffer));
        } else {
            top.append("#define ").append(nident).append(" ").append(expr.buffer).append("\n");
            return List.of(new Expression(body.buffer));
        }
    }

    @Override
    public List<Expression> visitList(ClojureParser.ListContext ctx) {
        return visitList_elem(ctx.list_elem());
    }

    @Override
    public List<Expression> visitList_elem(ClojureParser.List_elemContext ctx) {
        var e = new Expression();
        e.buffer.append("createElem(").append(visitExpression(ctx.expression(0)).getLast().buffer).append(", ");
        if (ctx.list_elem() != null) {
            e.buffer.append(visitList_elem(ctx.list_elem()).getLast().buffer);
        } else {
            e.buffer.append(visitExpression(ctx.expression(1)).getLast().buffer);
        }
        e.buffer.append(")");
        return List.of(e);
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
            }
            case "<=" -> {
                fName = "lisp_leq%s".formatted(defaultPrefix);
            }
            case "-" -> {
                fName = "lisp_sub%s".formatted(defaultPrefix);
            }
            case "+" -> {
                fName = "lisp_add%s".formatted(defaultPrefix);
            }
            case "*" -> {
                fName = "lisp_mul%s".formatted(defaultPrefix);
            }
            case "/" -> {
                fName = "lisp_div%s".formatted(defaultPrefix);
            }
            case "print" -> {
                fName = "lisp_printf";
            }
            case "fst" -> {
                fName = "lisp_list_fst";
            }
            case "snd" -> {
                fName = "lisp_list_snd";
            }
            default -> {
                if (Scopes.contains(Scopes.get(fName))) {
                    break;
                }

                throw new RuntimeException("Should not reach here: " + ctx.ident().getText());
            }
        }
        fName = Scopes.get(fName);
        if (Scopes.isNonOuterFunction(fName)) {
            buffer.append("(*").append(fName).append(")");
        } else {
            buffer.append(fName);
        }
        buffer.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(arguments.get(i).buffer);
//            System.out.println(arguments.get(i).buffer);
        }
        buffer.append(")");

        var response = new Expression(TYPE.NONE, Scopes.get(fName));
        response.buffer = buffer;
        innerCallDepth.set(n, innerCallDepth.get(n) - 1);
        if (innerCallDepth.get(n) == 0) {
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
                r.buffer.append("createInt(").append(ctx.atom().getText()).append(")");
                return List.of(r);
            }
            if (ctx.atom().ident() != null) {
                var r = Scopes.get(ctx.atom().ident().getText());
                var e = new Expression();
                if (Scopes.functions.containsKey(r)) {
//                    e.type = TYPE.FUNCTION;
                }
                e.value = r;
                e.buffer.append(r);
                return List.of(e);
            }
            if (ctx.atom().fn() != null) {
                return visitFn(ctx.atom().fn());
            }
            var e = new Expression();
            e.buffer.append(ctx.atom().getText());
            return List.of(e);
        }
        if (ctx.list() != null) {
            return visitList(ctx.list());
        }
        if (ctx.if_() != null) {
            return visitIf(ctx.if_());
        }
        if (ctx.defn() != null) {
            return visitDefn(ctx.defn());
        }

        if (ctx.let() != null) {
            return visitLet(ctx.let());
        }

        return List.of(new Expression());
    }

    @Override
    public List<Expression> visitParameter(ClojureParser.ParameterContext ctx) {
        var argName = ctx.ident().getText();
        Scopes.defineNewVariable(argName, argName);
        var r = new Expression();
        if (ctx.hint() != null && Expression.exprByHint(ctx.hint().getText(), false).type == TYPE.FUNCTION) {
            Scopes.functions.put(argName, "(Object (*) (Object))");
            r.buffer.append("Object (*").append(argName).append(")(Object)");
            return List.of(r);
        }
        r.buffer.append("Object").append(" ").append(argName);
        return List.of(r);
    }

    @Override
    public List<Expression> visitParameters(ParametersContext ctx) {
        var exp = new Expression(TYPE.NONE);

        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (i > 0) {
                exp.buffer.append(", ");
            }
            var param = visitParameter(ctx.parameter(i)).getLast().buffer;
            exp.buffer.append(param);
        }
        return List.of(exp);
    }

    @Override
    public List<Expression> visitDefnID(DefnIDContext ctx) {
        var name = ctx.ident().getText();
        Scopes.defineNewVariable(name, name);
        var exp = new Expression();
        exp.buffer.append(name);
        return List.of(exp);
    }

    @Override
    public List<Expression> visitArguments(ArgumentsContext ctx) {
        List<Expression> list = new ArrayList<>();
        for (var e : ctx.expression()) {
            var result = visitExpression(e);
            list.addAll(result);
        }
        return list;
    }

    @Override
    public List<Expression> visitFn(ClojureParser.FnContext ctx) {
        var params = visitParameters(ctx.parameters()).getLast().buffer;
        var body = visitExpressions(ctx.expressions());
        var mem = new StringBuilder();
//        System.out.println(params);
        mem.append("(").append(params).append(")").append(" {\n");

        for (int i = 0; i < body.size() - 1; i++) {
            mem.append(body.get(i).buffer).append(";");
        }
        mem.append("    return ");
        mem.append(body.getLast().buffer);
        mem.append(";");
        mem.append("\n}\n");
        var e = new Expression(TYPE.FUNCTION);
        e.buffer = mem;
        return List.of(e);
    }

    @Override
    public List<Expression> visitDefn(DefnContext ctx) {
        var signature = new StringBuilder("Object ");
        var name = visitDefnID(ctx.defnID()).getLast().buffer;
        Scopes.defineNewVariable(name.toString(), name.toString());
        signature.append(name);
        Scopes.createNew();
        var params = visitParameters(ctx.parameters()).getLast().buffer;
        var p = new StringBuilder("Object (*) (");
        var c = params.toString().split("Object", -1).length - 1;
        for (int i = 0; i < c; i++) {
            if (i > 0) p.append(",");
            p.append("Object");
        }
        p.append(")");
        Scopes.functions.put(name.toString(), p.toString());
//        System.out.println(p);
        var body = visitExpressions(ctx.expressions());
        var mem = new StringBuilder();
        mem.append(signature).append("(").append(params).append(")").append(" {\n");

        for (int i = 0; i < body.size() - 1; i++) {
            mem.append(body.get(i).buffer).append(";");
        }
        mem.append("    return ");
        mem.append(body.getLast().buffer);
        mem.append(";");
        mem.append("\n}\n");
        Scopes.deleteLast();
        var e = new Expression(TYPE.FUNCTION);
        e.buffer = mem;
//        System.out.println(params);
        return List.of(e);
    }
}
