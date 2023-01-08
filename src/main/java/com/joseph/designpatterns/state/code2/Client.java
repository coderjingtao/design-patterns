package com.joseph.designpatterns.state.code2;

import com.joseph.designpatterns.state.code2.model.SyncSalesOrder;
import com.joseph.designpatterns.state.code2.states.SalesOrderStatus;

public class Client {
    public static void main(String[] args) {
        SyncSalesOrder syncSalesOrder = new SyncSalesOrder();
        SalesOrderStatus.PendingFulfilled.next(syncSalesOrder);
        SalesOrderStatus.PendingInvoice.next(syncSalesOrder);
        SalesOrderStatus.Completed.next(syncSalesOrder);

    }
}
