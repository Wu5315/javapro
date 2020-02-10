package com.wu.test;

public class Myarray {
   private int[] array;
   private int size;//作为下标
   public Myarray(){//创建长度为10的数组
       array = new int[10];
   }
   public int getSize() {
       return size;
   }
   public void add(int i){
       array[size] = i;
       size++;
       if(size>=array.length){
           int[] newarray = new int[size+size/2];//创建新的更长的数组
           for(int j = 0;j < array.length;j++){
               newarray[j] = array[j];
           }
           array = newarray;
           System.out.println("扩容完成，现在数组长度"+array.length);
       }
   }
   public int get(int i) {
       if(0>i||i>=size){
           System.out.println("索引错误");
           return -1;
       }
       return array[i];
   }
}
