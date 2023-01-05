package com.joseph.designpatterns.strategy.functionalcode2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class StrategyFactory {
    private static BiFunction<Integer,Integer,Integer> ADD = (a,b) -> a + b;
    private static BiFunction<Integer,Integer,Integer> SUB = (a,b) -> a - b;
    private static BiFunction<Integer,Integer,Integer> MUL = (a,b) -> a * b;
    private static BiFunction<Integer,Integer,Integer> DIV = (a,b) -> a / b;

    private final static Map<Character,BiFunction<Integer,Integer,Integer>> strategyMap = new HashMap<>();
    static {
        strategyMap.put('+',ADD);
        strategyMap.put('-',SUB);
        strategyMap.put('*',MUL);
        strategyMap.put('/',DIV);
    }

    public static BiFunction<Integer,Integer,Integer> getStrategy(char type){
        return strategyMap.getOrDefault(type,ADD);
    }
}
