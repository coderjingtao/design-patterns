package com.joseph.designpatterns.state.code;

public class Developer implements Role{
    @Override
    public void doWork() {
        System.out.println("Doing Developer work");
    }
}
