package com.joseph.designpatterns.templatemethod.practice.service;

import com.joseph.designpatterns.templatemethod.practice.entity.SyncSalesOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Joseph.Liu
 */
public class PaymentUpdateSyncSalesOrderManager extends UpdateSyncSalesOrderManager {
    @Override
    protected List<SyncSalesOrder> getToBeProcessedSyncSalesOrders() {
        //Retrieve a list of SyncSalesOrder which meet business requirements
        List<SyncSalesOrder> syncSalesOrders = new ArrayList<>();
        return syncSalesOrders;
    }

    @Override
    protected boolean setSyncSalesOrderFromNetSuite(SyncSalesOrder syncSalesOrder) {
        String customerOrderNo = syncSalesOrder.getCustomerOrderNo();
        String paymentId = getPaymentIdByCustomerOrderNoFromNetSuite(customerOrderNo);
        if(Objects.isNull(paymentId)){
            return false;
        }
        syncSalesOrder.setPaymentId(paymentId);
        return true;
    }

    private String getPaymentIdByCustomerOrderNoFromNetSuite(String customerOrderNo) {
        return "123456";
    }
}
