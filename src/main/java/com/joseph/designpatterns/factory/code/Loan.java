package com.joseph.designpatterns.factory.code;

public class Loan implements Product {
    @Override
    public void operate() {
        System.out.println("贷款产品");
    }
}
