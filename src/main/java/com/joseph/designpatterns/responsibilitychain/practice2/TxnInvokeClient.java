package com.joseph.designpatterns.responsibilitychain.practice2;

import com.joseph.designpatterns.responsibilitychain.practice2.factory.TxnHandlerFactory;
import com.joseph.designpatterns.responsibilitychain.practice2.handler.TxnHandler;

public class TxnInvokeClient {
    public static void main(String[] args) {
        TxnHandler firstTxnHandler = TxnHandlerFactory.getFirstTxnHandler();
        firstTxnHandler.handle("bulk billing");
    }
}
