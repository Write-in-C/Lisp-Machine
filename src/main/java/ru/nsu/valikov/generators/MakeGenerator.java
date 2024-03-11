package ru.nsu.valikov.generators;

public interface MakeGenerator {
    void start();
    void finish();
    void target(String t);
    void dependency(String d);
    void action(String a);
    void endTarget(String t);
}
