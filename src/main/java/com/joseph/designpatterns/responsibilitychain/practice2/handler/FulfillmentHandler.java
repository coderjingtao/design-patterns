package com.joseph.designpatterns.responsibilitychain.practice2.handler;

public class FulfillmentHandler extends TxnHandler{
    @Override
    public int handle(Object obj) {
        System.out.println("FulfillmentHandler is processing: "+ obj);
        if(this.nextHandler != null){
            this.nextHandler.handle(obj);
        }
        return 0;
    }
}
