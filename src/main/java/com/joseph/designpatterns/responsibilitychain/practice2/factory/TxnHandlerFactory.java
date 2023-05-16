package com.joseph.designpatterns.responsibilitychain.practice2.factory;

import com.joseph.designpatterns.responsibilitychain.practice2.dao.HandlerDao;
import com.joseph.designpatterns.responsibilitychain.practice2.dao.HandlerDaoImpl;
import com.joseph.designpatterns.responsibilitychain.practice2.entity.TxnHandlerEntity;
import com.joseph.designpatterns.responsibilitychain.practice2.handler.TxnHandler;

public class TxnHandlerFactory {

    private static HandlerDao handlerDao = new HandlerDaoImpl();

    public static TxnHandler getFirstTxnHandler(){
        TxnHandlerEntity firstTxnHandlerEntity = handlerDao.getFirstHandlerEntity();
        TxnHandler firstTxnHandler = newInstance(firstTxnHandlerEntity);
        if(firstTxnHandler == null){
            return null;
        }

        TxnHandlerEntity tempHandlerEntity = firstTxnHandlerEntity;
        TxnHandler tempHandler = firstTxnHandler;
        Integer nextHandlerId = null;

        //遍历所有的handler，把它们用链表连接起来
        while( (nextHandlerId = tempHandlerEntity.getNextHandlerId()) != null ){
            TxnHandlerEntity handlerEntity = handlerDao.getHandlerEntity(nextHandlerId);
            TxnHandler txnHandler = newInstance(handlerEntity);
            tempHandler.setNextHandler(txnHandler);

            tempHandler = txnHandler;
            tempHandlerEntity = handlerEntity;
        }
        //返回第一个handler
        return firstTxnHandler;
    }

    private static TxnHandler newInstance(TxnHandlerEntity txnHandlerEntity){

        String classPath = txnHandlerEntity.getClassPath();
        try {
            Class<?> aClass = Class.forName(classPath);
            return (TxnHandler) aClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
