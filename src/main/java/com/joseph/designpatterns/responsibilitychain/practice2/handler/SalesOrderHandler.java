package com.joseph.designpatterns.responsibilitychain.practice2.handler;

public class SalesOrderHandler extends TxnHandler {
    @Override
    public int handle(Object obj) {
        System.out.println("SalesOrderHandler is processing: "+ obj);
        if(this.nextHandler != null){
            this.nextHandler.handle(obj);
        }
        return 0;
    }
}
