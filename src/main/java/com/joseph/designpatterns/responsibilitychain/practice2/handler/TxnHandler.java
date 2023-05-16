package com.joseph.designpatterns.responsibilitychain.practice2.handler;

import lombok.Setter;

@Setter
public abstract class TxnHandler {

    protected TxnHandler nextHandler;

    public abstract int handle(Object obj);
}
