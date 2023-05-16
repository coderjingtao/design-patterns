package com.joseph.designpatterns.responsibilitychain.practice2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TxnHandlerEnum {
    SO_HANDLER(new TxnHandlerEntity(1,"so handler","com.joseph.designpatterns.responsibilitychain.practice2.handler.SalesOrderHandler",null,2)),
    FUL_HANDLER(new TxnHandlerEntity(2,"fulfillment handler","com.joseph.designpatterns.responsibilitychain.practice2.handler.FulfillmentHandler",1,3)),
    INV_HANDLER(new TxnHandlerEntity(3,"invoice handler","com.joseph.designpatterns.responsibilitychain.practice2.handler.InvoiceHandler",2,null)),
    ;
    private TxnHandlerEntity txnHandlerEntity;
}
