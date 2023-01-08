package com.joseph.designpatterns.responsibilitychain.code2;

public class Client {
    public static void main(String[] args) {
        Handler<String> handlerA = new StrHandlerA();
        Handler<String> handlerB = new StrHandlerB();
        handlerA.setSuccessor(handlerB);

        String result = handlerA.handle("Joseph Code");
        System.out.println(result);
    }
}
