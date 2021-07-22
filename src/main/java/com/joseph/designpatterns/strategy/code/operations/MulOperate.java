package com.joseph.designpatterns.strategy.code.operations;

import com.joseph.designpatterns.strategy.code.CalculateStrategy;

public class MulOperate implements CalculateStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
