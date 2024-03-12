package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
import antlr.ClojureParser.ArgumentsContext;
import antlr.ClojureParser.CallContext;
import antlr.ClojureParser.DefnContext;
import antlr.ClojureParser.DefnIDContext;
import antlr.ClojureParser.ExpressionContext;
import antlr.ClojureParser.ExpressionsContext;
import antlr.ClojureParser.IfBodyContext;
import antlr.ClojureParser.IfContext;
import antlr.ClojureParser.ParametersContext;
import antlr.ClojureParser.ProgramContext;
import antlr.ClojureParser.ThenContext;
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
        Scopes.defineNewVariable("lisp_mul_int",
            new Expression(TYPE.FUNCTION, "lisp_mul_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_div_int",
            new Expression(TYPE.FUNCTION, "lisp_div_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_sub_int",
            new Expression(TYPE.FUNCTION, "lisp_sub_int", FUNCTION_TYPE.INT));
        Scopes.defineNewVariable("lisp_add_int",
            new Expression(TYPE.FUNCTION, "lisp_add_int", FUNCTION_TYPE.INT));
        functions.put("lisp_eq_int", List.of());
        functions.put("lisp_mul_int", List.of());
        functions.put("lisp_div_int", List.of());
        functions.put("lisp_sub_int", List.of());
        functions.put("lisp_add_int", List.of());
    }

    @Override
    public List<Expression> visitProgram(ProgramContext ctx) {
//        Scopes.createNew();

        file = "out/" + ctx.filename().IDENT().getText() + ".c";
        try (InputStreamReader stream = new InputStreamReader(
            Objects.requireNonNull(getClass().getResourceAsStream("/c-utils/startup.c")))) {
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

//        Scopes.deleteLast();
        return null;
    }

    @Override
    public List<Expression> visitIfBody(IfBodyContext ctx) {
        var exprs = super.visitIfBody(ctx);
//        mem.append(exprs.get(0).value);
        return exprs;
    }

    @Override
    public List<Expression> visitThen(ThenContext ctx) {
        return super.visitThen(ctx);
    }

    @Override
    public List<Expression> visitIf(IfContext ctx) {
        Scopes.createNew();

        var builder = new StringBuilder();
//        var condPart = ctx.body.list().expressions();
        visitIfBody(ctx.ifBody());
//        builder.append(cond.value);
//        builder.append("(");
        //2-arity function
//        builder.append(ctx.expression(1).getText()).append(", ");
//        builder.append(condPart.expression(2).getText()).append(")");
        mem.append(" ? ");
        //shit
        var then = visitThen(ctx.then());
        if (then.get(then.size() - 1).type != TYPE.FUNCTION) {
            mem.append(then.get(then.size() - 1).value);
        }
//        extracted(then, builder);
        mem.append(" : ");
        var els = visitElse(ctx.else_());

        if (els.get(els.size() - 1).type != TYPE.FUNCTION) {
            mem.append(els.get(then.size() - 1).value);
        }

        Scopes.deleteLast();
        return List.of(then.get(then.size() - 1));
    }

    List<Integer> recursionCallDepth = new ArrayList<>();

    @Override
    public List<Expression> visitCall(CallContext ctx) {
        var n = recursionCallDepth.size() - 1;
        recursionCallDepth.set(n, recursionCallDepth.get(n) + 1);
        var arguments = visitArguments(ctx.arguments());
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
//            System.out.println(arguments.get(i).buffer);
            buffer.append(arguments.get(i).buffer);
        }
        buffer.append(")");
        var response = Scopes.get(fName);
        response.buffer = buffer;
        recursionCallDepth.set(n, recursionCallDepth.get(n) - 1);
        if (recursionCallDepth.get(n) == 0) {
            System.out.println(fName);
            mem.append(buffer);
            recursionCallDepth.remove(n);
        }
        return List.of(response);
    }

    private static void extracted(List<Expression> boody, StringBuilder builder) {

        var c = 0;
        for (var i : boody) {
            if (i.type == TYPE.FUNCTION) {
                c++;
                builder.append(i.value).append("(");
            } else {
                builder.append(i.value);
                if (c > 0 && i != boody.get(boody.size() - 1)) {
                    builder.append(", ");
                }
            }
        }
        while (c-- > 0) {
            builder.append(")");
        }
    }

    @Override
    public List<Expression> visitExpressions(ExpressionsContext ctx) {
        List<Expression> list = new ArrayList<>();
        ctx.expression()
            .forEach(exp -> list.addAll(visitExpression(exp)));
        return list;
//        return super.visitExpressions(ctx);
    }

    @Override
    public List<Expression> visitExpression(ExpressionContext ctx) {

        if (ctx.call() != null) {
            if (recursionCallDepth.isEmpty()) {
                recursionCallDepth.add(0);
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
        mem.append("(");

        for (int i = 0; i < ctx.hint().size(); i++) {
            if (i > 0) {
                mem.append(", ");
            }
            var argName = ctx.ident(i).getText();
            var argType = Expression.exprByHint(ctx.hint(i).getText(), false);
            argType.buffer.append(argName);
            Scopes.defineNewVariable(argName, argType);

            mem.append(argType.getFunctionType()).append(" ")
                .append(argName);
        }

        mem.append(")");

        return null;
    }

    @Override
    public List<Expression> visitDefnID(DefnIDContext ctx) {
        var name = ctx.ident().getText();
        functions.put(name, List.of());

        var funcExpr = Expression.exprByHint(ctx.hint().getText(), true);
        Scopes.defineNewVariable(name, funcExpr);

        mem.append(funcExpr.getFunctionType()).append(" ")
            .append(name);

        return null;
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
        Scopes.createNew();

        visitDefnID(ctx.defnID());
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
