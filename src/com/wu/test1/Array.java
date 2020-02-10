package com.wu.test1;

public class Array {
    private int[] array;
    private int size;
    public Array(){
        array= new int[10];
    }
    public int getSize() {
        return size;
    }
    public void add(int i){
        array[size] = i;
        size++;
        if(size >= array.length){
            int[] newarray = new int[size+size /2];
            for(int j = 0;j < array.length;j++){
                newarray[j] = array[j];
            }
            array = newarray;
            System.out.println("扩容完成，现在数组长度"+array.length);
        }
    }
    public int get(int i){
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
