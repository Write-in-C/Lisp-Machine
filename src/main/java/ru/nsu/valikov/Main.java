package ru.nsu.valikov;

import antlr.ClojureLexer;
import antlr.ClojureParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.nsu.valikov.generators.TranslationVisitor;

public class Main {

    public static void main(String[] args) {
        String expression = """
            (ns sum)
            (defn sum ^Integer [^Integer a ^Integer b]
                 (+ a b))
            """;
        ClojureLexer lexer = new ClojureLexer(CharStreams.fromString(expression));
        ClojureParser parser = new ClojureParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        var res = new TranslationVisitor().visit(tree);
    }
}