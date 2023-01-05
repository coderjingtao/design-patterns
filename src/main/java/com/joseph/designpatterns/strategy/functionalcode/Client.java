package com.joseph.designpatterns.strategy.functionalcode;

import com.joseph.designpatterns.strategy.functionalcode.strategy.Strategies;

public class Client {
    public static void main(String[] args) {
        int a = 4, b = 2;
        //使用已经定义好的strategy
        Calculator calculator = new Calculator(Strategies.ADD);
        System.out.println("a + b = "+calculator.execute(a, b));

        //可以在使用calculator时再定义strategy
        calculator = new Calculator((x,y) -> x + y);
        System.out.println("a + b = "+calculator.execute(a, b));
    }
}
