package ru.nsu.valikov.generators;

public class Expression {

    public TYPE type = TYPE.NONE;
    public String value = "";
    public StringBuilder buffer = new StringBuilder();

    public Expression(TYPE type, String value) {
        this.type = type;
        this.value = value;
    }

    public Expression(TYPE type) {
        this(type, "");
    }

    public Expression() {
    }

    public Expression(StringBuilder buffer) {
        this.buffer = buffer;
    }

    public enum TYPE {
        INT,
        DOUBLE,
        BOOLEAN,
        LIST,
        FUNCTION,
        NONE;

        public enum FUNCTION_TYPE {
            VOID,
            INT,
            DOUBLE,
            BOOLEAN,
            NONE
        }
    }


    public static Expression exprByHint(String hint) {
        hint = hint.replace("^", "");
        return switch (hint) {
            case "Integer" -> new Expression(TYPE.INT);
            case "Double" -> new Expression(TYPE.DOUBLE);
            case "Boolean" -> new Expression(TYPE.BOOLEAN);
            case "java.lang.function" -> new Expression(TYPE.FUNCTION);
            default -> new Expression(TYPE.NONE);
        };
    }
}
