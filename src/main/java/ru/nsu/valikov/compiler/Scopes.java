package ru.nsu.valikov.compiler;

import java.util.*;

import lombok.experimental.UtilityClass;
import ru.nsu.valikov.generators.Expression;
import ru.nsu.valikov.generators.Expression.TYPE;

@UtilityClass
public class Scopes {

    private static final Deque<Map<String, Expression>> scopes = new ArrayDeque<>();

    public void createNew() {
        scopes.add(new HashMap<>());
//        System.out.println("created" + scopes);
    }

    public boolean contains(String name) {
        return scopes.stream().anyMatch(i -> i.containsKey(name));
    }

    public void defineNewVariable(String name, Expression var) {
        if (contains(name) && getType(name) != var.type) {
            throw new RuntimeException(
                    ("""
                            Duplicated variable names in intersected scopes.\s
                            Try to use different name.\s
                            Get: %s""").formatted(
                            name));
        }
        scopes.getLast().put(name, var);
    }

    public int getIntValue(String name) {
        if (!contains(name)) {
            throw new RuntimeException("No variable with such name: %s".formatted(name));
        }
        for (var scope : scopes) {
            var value = scope.get(name);
            if (value != null) {
                if (value.type == TYPE.INT) {
                    return Integer.parseInt(value.value);
                }
                throw new RuntimeException("Expected INT type, got %s".formatted(value.type));
            }
        }
        throw new AssertionError("should not reach here");
    }

    public void setIntValue(String name, int value) {
        if (!contains(name)) {
            defineNewVariable(name, new Expression(TYPE.INT, String.valueOf(value)));
            return;
        }
        for (var scope : scopes) {
            var val = scope.get(name);
            if (val != null) {
                if (val.type == TYPE.INT) {
                    scope.put(name, new Expression(TYPE.INT, String.valueOf(value)));
                    return;
                }
                throw new RuntimeException(
                        "Cannot assign INT to not INT variable: %s %s".formatted(name, val.type));
            }
        }
        throw new AssertionError("should not reach here");
    }

    public void deleteLast() {
        scopes.pollLast();
//        System.out.println("delete " + scopes);
    }

    public TYPE getType(String name) {
        if (!contains(name)) {
            throw new RuntimeException("No variable with such name : %s".formatted(name));
        }
        for (var scope : scopes) {
            var value = scope.get(name);
            if (value != null) {
                return value.type;
            }
        }
        throw new AssertionError("Should not reach here");
    }

    public Expression get(String name) {
        return scopes.stream()
                .map(i -> i.get(name))
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No variable with such name: %s".formatted(name)));
    }
}
