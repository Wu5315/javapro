package com.wu.test1;

public class Myarray1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0;i <array.length;i++){
            array[i] = i+1;
        }
        //找出数组中最大的数
        int a = array[0];
        for(int i = 1;i < array.length;i++){
            if(a<array[i]){
                a = array[i];
            }
        }
        System.out.println(a);
    }
}
