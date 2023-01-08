package com.joseph.designpatterns.state.code.states;

public class Developer implements Role {
    @Override
    public void doWork() {
        System.out.println(" Doing Developer work");
    }
}
