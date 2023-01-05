package com.joseph.designpatterns.decorator.code1;

public class CodingTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Doing coding task");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coding task is Done");
    }
}
