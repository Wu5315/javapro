package com.wu.test1;

public class Test4 {
    public static void main(String[] args) {
       Array array = new Array();
       for(int i = 1;i <= 20;i++){
           array.add(i);
       }
        System.out.println(array.getSize());
        for(int i = 0;i < array.getSize();i++){
            System.out.println(array.get(i));
        }
    }
}
