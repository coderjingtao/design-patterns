package com.joseph.designpatterns.strategy.functionalcode2;


import java.util.function.BiFunction;

public class Client {
    public static void main(String[] args) {
        int a = 4, b = 2;
        BiFunction<Integer, Integer, Integer> addStrategy = StrategyFactory.getStrategy('+');
        System.out.println("a + b = "+addStrategy.apply(a, b));

        BiFunction<Integer, Integer, Integer> subStrategy = StrategyFactory.getStrategy('-');
        System.out.println("a - b = "+subStrategy.apply(a, b));
    }
}
