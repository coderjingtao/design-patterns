package com.joseph.designpatterns.strategy.functionalcode.strategy;

@FunctionalInterface
public interface CalculateStrategy {
    int calculate(int a, int b);
}
