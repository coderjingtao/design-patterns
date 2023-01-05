package com.joseph.designpatterns.decorator.code1;

public class Tester {
    public static void main(String[] args) {
//        CodingTask codingTask = new CodingTask();
//        codingTask.run();

        new LoggingRunnable(new TransactionRunnable(new CodingTask())).run();
    }
}
