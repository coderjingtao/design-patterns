package com.joseph.designpatterns.responsibilitychain.practice2.dao;

import com.joseph.designpatterns.responsibilitychain.practice2.entity.TxnHandlerEntity;
import com.joseph.designpatterns.responsibilitychain.practice2.entity.TxnHandlerEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HandlerDaoImpl implements HandlerDao{

    private static Map<Integer, TxnHandlerEntity> handlerEntityMap = new HashMap<>();

    static {
        TxnHandlerEnum[] values = TxnHandlerEnum.values();
        for(TxnHandlerEnum value : values){
            TxnHandlerEntity txnHandlerEntity = value.getTxnHandlerEntity();
            handlerEntityMap.put(txnHandlerEntity.getHandlerId(), txnHandlerEntity);
        }
    }

    @Override
    public TxnHandlerEntity getHandlerEntity(Integer handlerId) {
        return handlerEntityMap.get(handlerId);
    }

    @Override
    public TxnHandlerEntity getFirstHandlerEntity() {
        return handlerEntityMap
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(txnHandlerEntity -> Objects.isNull(txnHandlerEntity.getPreHandlerId()))
                .findFirst()
                .orElse(null);
    }
}
