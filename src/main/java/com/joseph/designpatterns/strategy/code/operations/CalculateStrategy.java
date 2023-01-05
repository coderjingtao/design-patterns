package com.joseph.designpatterns.strategy.code.operations;

public interface CalculateStrategy {
    /**
     * 计算器通用的操作方法
     * @param a integer
     * @param b integer
     * @return result
     */
    int calculate(int a, int b);
}
