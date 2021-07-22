package com.joseph.designpatterns.templatemethod.practice;

import com.joseph.designpatterns.templatemethod.practice.service.PaymentUpdateSyncSalesOrderManager;
import com.joseph.designpatterns.templatemethod.practice.service.UpdateSyncSalesOrderManager;

public class Client {

    public static void main(String[] args) {
        UpdateSyncSalesOrderManager updateSyncSalesOrderManager = new PaymentUpdateSyncSalesOrderManager();
        updateSyncSalesOrderManager.updateSyncSalesOrders();
    }
}
