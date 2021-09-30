package com.joseph.designpatterns.effective.item1;

/**
 * Item1: 用静态工厂方法取代构造器
 * @author Joseph.Liu
 */
public class User {

    private String name;

    private int age;

    private static User singletonUser = new User();

    private User(String name, int age){
        this.name = name;
        this.age = age;
    }
    private User(){

    }

    public static User newInstance(String name, int age){
        return new User(name,age);
    }

    public static User getInstance(){
        return singletonUser;
    }

    public static MyInterface getMyInterfaceInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (MyInterface) Class.forName(System.getProperty("my.interface.implementation.class")).newInstance();
    }
}
