package com.joseph.designpatterns.strategy.functionalcode.strategy;

/**
 * 把所有的策略工厂类都写到一个类中实现，减少策略类的个数
 */
public class Strategies {
    public static CalculateStrategy ADD = (a,b) -> a + b;
    public static CalculateStrategy SUB = (a,b) -> a - b;
    public static CalculateStrategy MUL = (a,b) -> a * b;
    public static CalculateStrategy DIV = (a,b) -> a / b;
}
