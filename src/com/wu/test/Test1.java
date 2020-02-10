package com.wu.test;

public class Test1 {
    public static void main(String[] args) {
        Dog d = new Dog("saneryi",20);
        d.setAge(200);
        System.out.println(d.getAge());
        System.out.println(d.getName());
        d.run();

    }
}
