package com.joseph.designpatterns.state.code.states;

public class Manager implements Role {
    @Override
    public void doWork() {
        System.out.println(" Doing Manager work");
    }
}
