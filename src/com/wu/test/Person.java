package com.wu.test;

public class Person extends Animal{
    public Person(String name,int age){
       super(name,age);
    }
    private char sex;
    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    @Override
    public void run(){
        System.out.println("走路");
    }
}
