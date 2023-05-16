package com.joseph.designpatterns.responsibilitychain.practice2.handler;

public class InvoiceHandler extends TxnHandler{
    @Override
    public int handle(Object obj) {
        System.out.println("InvoiceHandler is processing: "+ obj);
        if(this.nextHandler != null){
            this.nextHandler.handle(obj);
        }
        return 0;
    }
}
