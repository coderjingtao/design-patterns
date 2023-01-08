package com.joseph.designpatterns.state.code;

import com.joseph.designpatterns.state.code.states.Developer;
import com.joseph.designpatterns.state.code.states.Manager;

public class Client {
    public static void main(String[] args) {
        Employee joseph = new Employee("Joseph",3000,new Developer());
        Employee mary = new Employee("Mary",1500,new Developer());

        joseph.doWork();
        mary.doWork();
        System.out.println("-----After Promotion-----");
        joseph.setRole(new Manager());
        joseph.doWork();
        mary.doWork();
    }
}
