package com.joseph.designpatterns.strategy.code.operations;

public class SubOperate implements CalculateStrategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
