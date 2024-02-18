package ru.nsu.valikov.generators;

import antlr.ClojureBaseVisitor;
import antlr.ClojureParser.ExpressionContext;
import antlr.ClojureParser.IfContext;
import antlr.ClojureParser.ProgramContext;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TranslationVisitor extends ClojureBaseVisitor<Object> {

    @Override
    public Object visitProgram(ProgramContext ctx) {
        var file = "out/" + ctx.filename().IDENT().getText() + ".c";
        System.out.println(file);
        try (FileOutputStream stream = new FileOutputStream(file)) {
            var start = """
                #include <stdio.h>

                int main() {
                """;
            stream.write(start.getBytes());
            super.visitProgram(ctx);
            var end = """
                    return 0;
                }
                """;
            stream.write(end.getBytes());
        } catch (IOException exception) {
            throw new RuntimeException("No such file or another problem", exception);
        }
        return null;
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        if (!ctx.if_().isEmpty()){
            var res = visitIf(ctx.if_());
        }
        return super.visitExpression(ctx);
    }

    @Override
    public Boolean visitIf(IfContext ctx) {

    }
}
