package com.joseph.designpatterns.factory.functionalcode;

import com.joseph.designpatterns.factory.code.Insurance;
import com.joseph.designpatterns.factory.code.Loan;
import com.joseph.designpatterns.factory.code.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {
    final static Map<String, Supplier<Product>> productMap = new HashMap<>();
    static {
        productMap.put("loan", Loan::new);
        productMap.put("insurance", Insurance::new);
    }

    public static Product createProduct(String type){
        Supplier<Product> supplier = productMap.get(type);
        if(supplier == null){
            throw new IllegalArgumentException("No such product "+type);
        }
        return supplier.get();
    }
}
