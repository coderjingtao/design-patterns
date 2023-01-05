package com.joseph.designpatterns.state.code;

public class Client {
    public static void main(String[] args) {
        Employee joseph = new Employee("Joseph",3000,new Developer());
        Employee mary = new Employee("Mary",1500,new Developer());

        joseph.doWork();
        mary.doWork();
        //promotion
        joseph.setRole(new Manager());
        joseph.doWork();
        mary.doWork();
    }
}
