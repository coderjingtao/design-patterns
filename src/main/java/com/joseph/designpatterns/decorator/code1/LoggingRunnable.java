package com.joseph.designpatterns.decorator.code1;

public class LoggingRunnable implements Runnable{

    private final Runnable runnable;

    public LoggingRunnable(Runnable runnable){
        this.runnable = runnable;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("start time is "+startTime);
        this.runnable.run();
        System.out.println("execute time is " + (System.currentTimeMillis() - startTime));
    }
}
