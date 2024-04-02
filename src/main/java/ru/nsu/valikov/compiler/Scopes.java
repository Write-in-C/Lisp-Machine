package ru.nsu.valikov.compiler;

import lombok.experimental.UtilityClass;

import java.util.*;

@UtilityClass
public class Scopes {

    private static final Deque<Map<String, String>> scopes = new ArrayDeque<>();

    public static final Map<String, String> functions = new HashMap<>();

    public void createNew() {
        scopes.add(new HashMap<>());
    }

    public boolean contains(String name) {
        return scopes.stream().anyMatch(i -> i.containsKey(name));
    }

    public void defineNewVariable(String name, String alias) {
        scopes.getLast().put(name, alias);
    }

    public void deleteLast() {
        scopes.pollLast();
    }

    public String get(String name) {
        return scopes.stream()
                .map(i -> i.get(name))
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No variable with such name: %s".formatted(name)));
    }

    public boolean isNonOuterFunction(String name) {
        return !scopes.getFirst().containsKey(name);
    }
}
