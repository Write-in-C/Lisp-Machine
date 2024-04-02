package ru.nsu.valikov;

import antlr.ClojureLexer;
import antlr.ClojureParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.nsu.valikov.generators.TranslationVisitor;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        var file = "samples/all_in.clj";

        var stream = CharStreams.fromStream(Objects.requireNonNull(Main.class.getClassLoader().getResourceAsStream(file)));

        ClojureLexer lexer = new ClojureLexer(stream);
        ClojureParser parser = new ClojureParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        new TranslationVisitor().visit(tree);
    }
}