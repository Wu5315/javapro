package com.wu.test;

import java.sql.SQLOutput;

public class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void run() {
        System.out.println("paopaopaopao");
    }
}

