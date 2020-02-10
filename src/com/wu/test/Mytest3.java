package com.wu.test;



public class Mytest3 {
    public static void main(String[] args) {
        Myarray myarray = new Myarray();
        for(int i = 1;i <= 20;i++){
            myarray.add(i);
        }
        for(int i = 0;i < myarray.getSize();i++){
            System.out.println(myarray.get(i));
        }
    }
}
