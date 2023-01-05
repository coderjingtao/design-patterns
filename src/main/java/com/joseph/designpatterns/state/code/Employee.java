package com.joseph.designpatterns.state.code;

public class Employee {
    private final String name;
    private final int salary;
    private Role role;

    public Employee(String name, int salary, Role role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public void doWork(){
        System.out.println("My name is "+ name);
        role.doWork();
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
