package com.wu.test;

public class Mytest2 {
    public static void main(String[] args) {
        //选择排序
        //用第一个数和后面每一个数比较
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        for(int i = 0;i < array.length-1;i++){
            for(int j = i+1;j <= array.length-1;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int a : array){
            System.out.println(a);
        }
        //冒泡排序
        //相邻两个数互相比较，然后交换位置，将大的放在后面。
        int[] array1 = {10,9,8,7,6,5,4,3,2,1};
        int flag = 0;
        for(int i = 0;i < array.length-1;i++){
            for(int j = 0;j < array.length-1-i;j++){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                    flag++;
                }
                if(flag == 0){
                    break;
                }
            }
        }
        for(int b : array1){
            System.out.println(b);
        }




        //二分搜索
        //在数组中快速查找元素的一种方法
        //前提是  必须是有序的数组
        int[] array2 = new int[100000];
        int a = 1;
        for(int i = 0;i < array2.length;i++){
            array2[i] = i+1;
        }
        int l = find(array2,a);
        System.out.println(l);
    }
    public static int find(int a[],int n){
        int min = 0;
        int max = a.length-1;
        int mid;
        int m = 0;
        while(min <= max){
            mid = (min+max)/2;
            m++;
            if(a[mid]==n){
                System.out.println("查找了"+m+"次");
                return mid;
            }else if(n<a[mid]){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return -1;
    }
}
