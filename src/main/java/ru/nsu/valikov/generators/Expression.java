package ru.nsu.valikov.generators;

public class Expression {

    // all translation must be in separate module

    public final TYPE type;
    public final String value;


    public Expression(TYPE type, String value) {
        this.type = type;
        this.value = value;
    }

    public Expression(TYPE type) {
        this(type, defaultValue(type));
    }

    public enum TYPE {
        INT,
        DOUBLE,
        FUNCTION,
        BOOLEAN,
        LIST,
        NONE; // not inferred
    }

    public static String defaultValue(TYPE type) {
        return switch (type) {
            case INT -> "0";
            case DOUBLE -> "0.";
            case LIST -> "[ ]";
            case NONE -> "nil";
            case BOOLEAN -> "false";
            case FUNCTION -> "void * ";
        };
    }
}
