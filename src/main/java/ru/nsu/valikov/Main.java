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
            (ns factorial)
            (defn factorial ^Integer [^Integer n]
                  (if (= n 0)
                    1
                    (* n (factorial (- n 1)))))
            """;
        ClojureLexer lexer = new ClojureLexer(CharStreams.fromString(expression));
        ClojureParser parser = new ClojureParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        var res = new TranslationVisitor().visit(tree);
    }
}