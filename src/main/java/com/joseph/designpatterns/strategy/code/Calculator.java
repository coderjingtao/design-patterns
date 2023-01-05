package com.joseph.designpatterns.strategy.code;

import com.joseph.designpatterns.strategy.code.operations.CalculateStrategy;

/**
 * 用策略模式进行计算器的设计
 * 其主要目的是针对不同的操作，通过定义相似的算法，替换if else语句写法
 */
public class Calculator {

    private CalculateStrategy strategy;

    public Calculator(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return this.strategy.calculate(a,b);
    }
}
