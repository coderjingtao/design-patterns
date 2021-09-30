package com.joseph.designpatterns.effective.item3;

/**
 * 实现单例的几种方式
 * @author Joseph.Liu
 */
public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public void someMethod(){}
}
