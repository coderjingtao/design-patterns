package com.joseph.designpatterns.state.code;

import com.joseph.designpatterns.state.code.states.Role;

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
        System.out.print("My name is "+ name);
        role.doWork();
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
