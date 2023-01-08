package com.joseph.designpatterns.factory.code;

public class ProductFactory {
    public static Product createProduct(String type){
        switch (type){
            case "loan" : return new Loan();
            case "insurance" : return new Insurance();
            default: throw new IllegalArgumentException("No such product " + type);
        }
    }
}
