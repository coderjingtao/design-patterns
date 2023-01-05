package com.joseph.designpatterns.strategy.functionalcode;


import com.joseph.designpatterns.strategy.functionalcode.strategy.CalculateStrategy;

public class Calculator {

    private CalculateStrategy strategy;

    public Calculator(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return this.strategy.calculate(a,b);
    }
}
