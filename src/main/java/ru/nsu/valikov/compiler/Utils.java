package ru.nsu.valikov.compiler;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {
    private long functionId=0;
    public String getIdForLambda(){
        return String.valueOf(functionId++);
    }
}
