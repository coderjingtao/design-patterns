package com.joseph.designpatterns.effective.item2;

import lombok.val;

/**
 * 构造器需要传很多参数时，使用builder模式
 * @author Joseph.Liu
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int height;

    public static class Builder{
        //required
        private final String firstName;
        private final String lastName;
        //optional
        private int age = 0;
        private int height = 0;

        public Builder(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int val){
            this.age = val;
            return this;
        }
        public Builder height(int val){
            this.height = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
    }
}
