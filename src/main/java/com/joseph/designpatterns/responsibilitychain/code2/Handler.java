package com.joseph.designpatterns.responsibilitychain.code2;

public abstract class Handler<T> {

    protected Handler<T> successor;

    public void setSuccessor(Handler<T> successor){
        this.successor = successor;
    }

    public T handle(T input){
        T t = doHandle(input);
        if(this.successor != null){
            return successor.doHandle(t);
        }
        return t;
    }

    abstract protected T doHandle(T input);
}
