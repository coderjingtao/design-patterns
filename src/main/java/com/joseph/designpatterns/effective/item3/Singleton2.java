package com.joseph.designpatterns.effective.item3;

/**
 * 实现单例的几种方式
 * @author Joseph.Liu
 */
public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return INSTANCE;
    }

    public void doSomething(){}
}
