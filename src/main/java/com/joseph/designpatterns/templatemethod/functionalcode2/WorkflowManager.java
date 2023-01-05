package com.joseph.designpatterns.templatemethod.functionalcode2;

/**
 * 使用【函数式接口】来取代抽象类及抽象方法
 * 当接口中只有一个抽象方法的时候，它被称为函数式接口,或者用注解@FunctionalInterface来确保它是个函数式接口
 * @author Joseph.Liu
 */
@FunctionalInterface
public interface WorkflowManager {
    /**
     * 默认方法取代抽象类中的非抽象方法
     */
    default void doTask1(){
        System.out.println("Doing Task1");
    }
    /**
     * 抽象方法等同于抽象类中的抽象方法
     */
    void doTask2();
    /**
     * 默认方法取代抽象类中的非抽象方法
     */
    default void doTask3(){
        System.out.println("Doing Task3");
    }

    /**
     * 静态方法
     */
    static void doTask4(){
        System.out.println("接口中的静态方法: Doing Task4");
    }

}
