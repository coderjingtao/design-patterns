package com.joseph.designpatterns.state.code2.states;

import com.joseph.designpatterns.state.code2.model.SyncSalesOrder;

public interface SalesOrderState {
    void next(SyncSalesOrder syncSalesOrder);
}
