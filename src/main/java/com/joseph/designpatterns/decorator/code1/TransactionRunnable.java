package com.joseph.designpatterns.decorator.code1;

public class TransactionRunnable implements Runnable{

    private final Runnable runnable;

    public TransactionRunnable(Runnable runnable){
        this.runnable = runnable;
    }

    @Override
    public void run() {
        System.out.println("Transaction is starting...");
        this.runnable.run();
        System.out.println("Transaction is committed.");
    }
}
