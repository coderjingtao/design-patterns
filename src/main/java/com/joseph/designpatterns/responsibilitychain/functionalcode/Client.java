package com.joseph.designpatterns.responsibilitychain.functionalcode;

import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        Function<String, String> funcPipeline = Functions.StrHandlerA.andThen(Functions.StrHandlerB);
        String result = funcPipeline.apply("Joseph code");
        System.out.println(result);
    }
}
