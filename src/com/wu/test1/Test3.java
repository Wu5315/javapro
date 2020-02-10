package com.wu.test1;

public class Test3 {
    public static void main(String[] args) {
        //选择排序
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i < array.length;i++){
            for(int j = i+1;j <array.length;j++){
                if(array[i] < array[j]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
        //冒泡排序
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i < array1.length;i++){
            boolean flag = true;
            for(int j = 0;j < array.length-1-i;j++){
                if(array[j] < array[j+1]){
                    int temp = 0;
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        for(int i = 0;i < array1.length;i++){
            System.out.println(array[i]);
        }
        //二分搜索
        int[] array2 = new int[100000];
        int a = 1;
        for(int i = 0;i < array2.length;i++){
            array2[i] = i+1;
        }
        Test3.find(array2,a);
    }

    public static void find(int[] array,int a){
        int max = array.length-1;
        int mix = 0;
        int mid;
        int n = 0;
        while(mix <= max){
            mid = (max+mix)/2;
            n++;
            if(a==array[mid]){
                System.out.println(mid);
                System.out.println("查找了"+n+"次");
                break;
            }else if(a > mid){
                mix = mid + 1;
            }else{
                max = mid - 1;
            }
        }

    }
}
