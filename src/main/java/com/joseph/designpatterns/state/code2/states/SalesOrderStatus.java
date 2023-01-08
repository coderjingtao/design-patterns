package com.joseph.designpatterns.state.code2.states;

import com.joseph.designpatterns.state.code2.model.SyncSalesOrder;

/**
 * 把所有的状态归结为一个enum类中，每种状态实现自己的状态接口方法
 */
public enum SalesOrderStatus implements SalesOrderState{
    PendingFulfilled{
        @Override
        public void next(SyncSalesOrder syncSalesOrder) {
            //生成fulfillment
            System.out.println("Fulfillment is generated.");
            //设置下一个状态
            syncSalesOrder.setStatus(SalesOrderStatus.PendingInvoice);
        }
    },
    PendingInvoice{
        @Override
        public void next(SyncSalesOrder syncSalesOrder) {
            //生成invoice
            System.out.println("Invoice is generated.");
            //设置下一个状态
            syncSalesOrder.setStatus(SalesOrderStatus.Completed);
        }
    },
    Completed{
        @Override
        public void next(SyncSalesOrder syncSalesOrder) {
            System.out.println("Done.");
        }
    }
    ;
}
