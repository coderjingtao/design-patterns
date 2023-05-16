package com.joseph.designpatterns.responsibilitychain.practice2.dao;

import com.joseph.designpatterns.responsibilitychain.practice2.entity.TxnHandlerEntity;

public interface HandlerDao {

    TxnHandlerEntity getHandlerEntity(Integer handlerId);

    TxnHandlerEntity getFirstHandlerEntity();
}
