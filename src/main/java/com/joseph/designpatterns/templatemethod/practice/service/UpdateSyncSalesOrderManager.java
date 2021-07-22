package com.joseph.designpatterns.templatemethod.practice.service;

import com.joseph.designpatterns.templatemethod.practice.entity.SyncSalesOrder;
import com.joseph.designpatterns.templatemethod.practice.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * @author Joseph.Liu
 */
public abstract class UpdateSyncSalesOrderManager {

    public final void updateSyncSalesOrders(){

        //1.从本地数据库中读取SyncSalesOrder数据，并根据大小切分成数量相等的block
        List<SyncSalesOrder> syncSalesOrders = getToBeProcessedSyncSalesOrders();
        int total = syncSalesOrders.size();
        System.out.println("There are " + total + " syncSalesOrders might need to find missing EbayPaymentId");
        int sum = 0;
        if(ListUtil.isNotEmpty(syncSalesOrders)){
            List<List<SyncSalesOrder>> splitList = ListUtil.splitList(syncSalesOrders, 100);
            for(List<SyncSalesOrder> batchList : splitList){
                List<SyncSalesOrder> updatedList = new ArrayList<>();
                for(SyncSalesOrder syncSalesOrder : batchList){
                    //2.根据实际业务逻辑,设置syncSalesOrder中具体的业务值
                    if(setSyncSalesOrderFromNetSuite(syncSalesOrder)){
                        updatedList.add(syncSalesOrder);
                    }
                }
                if(ListUtil.isNotEmpty(updatedList)){
                    //syncSalesOrderRepository.saveAll(updatedList);
                }
                sum += batchList.size();
                //print progress
            }
        }
    }

    protected abstract List<SyncSalesOrder> getToBeProcessedSyncSalesOrders();

    protected abstract boolean setSyncSalesOrderFromNetSuite(SyncSalesOrder syncSalesOrder);

}
