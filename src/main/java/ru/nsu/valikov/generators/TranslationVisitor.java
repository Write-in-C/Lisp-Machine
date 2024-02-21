package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
import antlr.ClojureParser.DefnContext;
import antlr.ClojureParser.ExpressionContext;
import antlr.ClojureParser.ExpressionsContext;
import antlr.ClojureParser.IfContext;
import antlr.ClojureParser.ProgramContext;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TranslationVisitor extends ClojureBaseVisitor<String> {

    String file;
    StringBuilder mem = new StringBuilder();

    @Override
    public String visitProgram(ProgramContext ctx) {
        file = "out/" + ctx.filename().IDENT().getText() + ".c";
        var start = """
            #include <stdio.h>

            int main() {
            """;
        mem.append(start);
        super.visitProgram(ctx);
        var end = """
                return 0;
            }
            """;
        mem.append(end);
        return null;
    }

//    @Override
//    public String visitIf(IfContext ctx) {
//        var cond = visitExpression(ctx.expression(0));
//        mem.append("if (").append(cond).append(") {\n");
//
//    }

    @Override
    public String visitExpressions(ExpressionsContext ctx) {
        return super.visitExpressions(ctx);
    }

    @Override
    public String visitDefn(DefnContext ctx) {
        var name = "lisp_" + ctx.ident().getText();
        var returnType = "lisp_defn_" + name + "_type";
//        StringBuilder defnBuilder = new StringBuilder();
        mem.append(returnType).append(" ")
            .append(name).append("(");
        for (int i = 0; i < ctx.idents().ident().size(); i++) {
            if (i > 0) {
                mem.append(", ");
            }
            var argName = ctx.idents().ident(i).getText();
            var argType = "lisp_defn_" + name + "_arg_" + argName + "_type";
            mem.append(argType).append(" ")
                .append(argName);
        }
        mem.append(") {\n");
//        super.visitDefn(ctx);
        var res = visitExpressions(ctx.expressions());
        mem.append(res);
        mem.append("}\n");
        return null;
    }
}
