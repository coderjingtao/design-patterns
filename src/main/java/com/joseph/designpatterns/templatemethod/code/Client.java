package com.joseph.designpatterns.templatemethod.code;

/**
 * @author Joseph.Liu
 */
public class Client {
    static void initWorkflow(WorkflowManager workflowManager){
        System.out.println("Starting the workflow ...");
        workflowManager.doTask1();
        workflowManager.doTask2();
        workflowManager.doTask3();
        WorkflowManager.doTask4();
    }

    public static void main(String[] args) {
        //这样实现的前提是：接口中只有一个抽象方法的时候
        //因为Lambda表达式只能针对函数式接口使用。
//        initWorkflow(() -> System.out.println("Doing Task2"));

        WorkflowManager workflowManager = () -> {
            System.out.println("使用Lambda");
        };
        workflowManager.doTask2();
    }
}
