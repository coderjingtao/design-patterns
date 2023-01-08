package com.joseph.designpatterns.factory.code;

public class Insurance implements Product{
    @Override
    public void operate() {
        System.out.println("保险产品");
    }
}
