package com.joseph.designpatterns.state.code2.model;

import com.joseph.designpatterns.state.code2.states.SalesOrderState;
import com.joseph.designpatterns.state.code2.states.SalesOrderStatus;

public class SyncSalesOrder {
    private SalesOrderStatus status;

    public SyncSalesOrder(){
        this.status = SalesOrderStatus.PendingFulfilled;
    }

    public SalesOrderState getStatus() {
        return status;
    }
    public void setStatus(SalesOrderStatus status) {
        this.status = status;
    }
}
