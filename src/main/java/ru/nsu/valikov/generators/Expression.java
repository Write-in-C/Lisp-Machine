package ru.nsu.valikov.generators;

import ru.nsu.valikov.generators.Expression.TYPE.FUNCTION_TYPE;

public class Expression {

    public final TYPE type;
    public FUNCTION_TYPE functionType = FUNCTION_TYPE.NOT_A_FUNCTION;
    public final String value;
    public StringBuilder buffer = new StringBuilder();

    public Expression(TYPE type, String value, FUNCTION_TYPE functionType) {
        this.type = type;
        this.value = value;
        this.functionType = functionType;
    }

    public Expression(TYPE type, FUNCTION_TYPE functionType) {
        this(type, "", functionType);
    }

    public Expression(TYPE type, String value) {
        this(type, value, FUNCTION_TYPE.NOT_A_FUNCTION);
    }

    public Expression(TYPE type) {
        this(type, defaultValue(type));
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
            NOT_A_FUNCTION
        }
    }

    public static String defaultValue(TYPE type) {
        return switch (type) {
            case INT, BOOLEAN -> "0";
            case DOUBLE -> "0.";
            case LIST -> "[ ]";
            case FUNCTION -> "void * ";
            case NONE -> "null";
        };
    }

    public String getFunctionType() {
        return switch (type) {
            case INT, BOOLEAN -> "int";
            case DOUBLE -> "double";
            case LIST -> "[]";
            case FUNCTION -> switch (functionType) {
                case VOID -> "void";
                case INT, BOOLEAN -> "int";
                case DOUBLE -> "double";
                case NOT_A_FUNCTION -> "void *"; // should not reach here
            };
            case NONE -> null;
        };
    }

    public static Expression exprByHint(String hint, boolean isFunction) {
        hint = hint.replace("^", "");
        if (isFunction) {
            return new Expression(TYPE.FUNCTION, switch (hint) {
                case "Integer" -> FUNCTION_TYPE.INT;
                case "Double" -> FUNCTION_TYPE.DOUBLE;
                case "Boolean" -> FUNCTION_TYPE.BOOLEAN;
//                case "void" -> FUNCTION_TYPE.VOID;
                default -> throw new IllegalStateException("should not reach here:" + hint);
            });
        }
        return switch (hint) {
            case "Integer" -> new Expression(TYPE.INT);
            case "Double" -> new Expression(TYPE.DOUBLE);
            case "Boolean" -> new Expression(TYPE.BOOLEAN);
            case "java.util.function.Function" -> new Expression(TYPE.FUNCTION);
            default -> throw new IllegalStateException("should not reach here:" + hint);
        };
    }
}
