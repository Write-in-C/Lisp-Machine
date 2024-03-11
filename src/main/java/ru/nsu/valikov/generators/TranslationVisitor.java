package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
import antlr.ClojureParser.DefnContext;
import antlr.ClojureParser.ExpressionContext;
import antlr.ClojureParser.ExpressionsContext;
import antlr.ClojureParser.IfContext;
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

public class TranslationVisitor extends ClojureBaseVisitor<List<Expression>> {

    String file;
    StringBuilder mem = new StringBuilder();
    boolean shouldPrint = false;

    private static final Map<String, List<String>> functions = new HashMap<>();

    @Override
    public List<Expression> visitProgram(ProgramContext ctx) {
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
        return null;
    }

    @Override
    public List<Expression> visitIf(IfContext ctx) {
        var builder = new StringBuilder();
        var condPart = ctx.expression(0).list().expressions();
        var cond = visitExpression(condPart.expression(0)).get(0);
        var then = visitExpression(ctx.expression(1));
        var els = visitExpression(ctx.expression(2));
        builder.append(cond.value);
        builder.append("(");
        //2-arity function
        builder.append(condPart.expression(1).getText()).append(", ");
        builder.append(condPart.expression(2).getText()).append(")");
        builder.append(" ? ");
        //shit
        extracted(then, builder);
        builder.append(" : ");
        extracted(els, builder);
        if (shouldPrint) {
            mem.append(builder);
        }
//        System.out.println(then.get(then.size() - 1).type);
        return List.of(then.get(then.size() - 1));
    }

    private static void extracted(List<Expression> then, StringBuilder builder) {

        var c = 0;
        for (var i : then) {
//            System.out.println(i.type + " " + i.value);
            if (i.type == TYPE.FUNCTION) {
                c++;
                builder.append(i.value).append("(");
            } else {
                builder.append(i.value);
                if (c > 0 && i != then.getLast()) {
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
    }

    @Override
    public List<Expression> visitExpression(ExpressionContext ctx) {
        // костыль на костыле
        // it must be recursive
        if (ctx.atom() != null) {
            if (ctx.atom().number() != null) {
                return List.of(new Expression(Expression.TYPE.INT,
                    ctx.atom().number().getText()));
            }
            if (ctx.atom().ident() != null) {
                if (ctx.atom().ident().getText().equals("=")) {
                    return List.of(new Expression(TYPE.FUNCTION, "lisp_eq"));
                }
                if (ctx.atom().ident().getText().equals("-")) {
//                    System.out.println("fsdf");
                    return List.of(new Expression(TYPE.FUNCTION, "lisp_sub"));
                }
                if (ctx.atom().ident().getText().equals("*")) {
                    return List.of(new Expression(TYPE.FUNCTION, "lisp_mul"));
                }
                if (functions.containsKey("lisp_" + ctx.getText())) {
                    return List.of(new Expression(TYPE.FUNCTION, ctx.getText()));
                }
                Scopes.defineNewVariable(ctx.getText(), new Expression(TYPE.NONE));
                return List.of(new Expression(TYPE.NONE, ctx.getText()));
            }
            // NONE only for now
            Scopes.defineNewVariable(ctx.atom().getText(), new Expression(TYPE.NONE));
            return visitAtom(ctx.atom());
        }
        if (ctx.list() != null && ctx.list().expressions() != null) {
            return visitExpressions(ctx.list().expressions());
        }
        if (ctx.if_() != null) {
            return visitIf(ctx.if_());
        }
        super.visitExpression(ctx);
        return List.of(new Expression(Expression.TYPE.NONE, ""));
    }

    @Override
    public List<Expression> visitDefn(DefnContext ctx) {
        Scopes.createNew();

        var name = "lisp_" + ctx.ident().getText();
        functions.put(name, List.of());
        visitIdent(ctx.ident());
        visitIdents(ctx.idents());
        var exprs = visitExpressions(ctx.expressions());
        var returnType = exprs.getLast().type;
        String type = "";
        if (returnType == TYPE.INT) {
            type = "int";
        }
//        var returnType = "lisp_defn_" + name + "_type";
        mem.append(type).append(" ")
            .append(name).append("(");
        for (int i = 0; i < ctx.idents().ident().size(); i++) {
            if (i > 0) {
                mem.append(", ");
            }
            var argName = ctx.idents().ident(i).getText();
            var argType = Scopes.getType(argName);
            mem.append(argType).append(" ")
                .append(argName);
        }
        mem.append(") {\nreturn ");
        shouldPrint = true;
        visitExpressions(ctx.expressions());
        mem.append(";");
        mem.append("\n}\n");
        Scopes.deleteLast();
        return null;
    }
}
