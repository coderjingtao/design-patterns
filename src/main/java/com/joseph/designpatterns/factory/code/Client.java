package com.joseph.designpatterns.factory.code;

public class Client {
    public static void main(String[] args) {
        Product p = ProductFactory.createProduct("loan");
        p.operate();
        Product p1 = ProductFactory.createProduct("insurance");
        p1.operate();
    }
}
