package com.wu.test;

import java.util.ArrayList;
import java.util.List;

public class Mytest13 {
    public static void main(String[] args) {
        //输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
        //1 1 2 3 5 8 13
        System.out.println(method(7));
        System.out.println(baoshu(1000));
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i <= 10;i++){
            if(i<3){
                list.add(1);
            }else{
                Integer j = list.get(i-2)+list.get(i-1);
                list.add(j);
            }
        }
        System.out.println(list);

        //一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
        double height = 100;
        int size = 1;
        while(size<=10){
            height = height/2;
            System.out.println("第"+size+"次反弹，反弹高度为："+height);
            size++;
        }
        //一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
        //a+100==b*b;a+168==c*c;
        //c*c-b*b==68;
        for(int i = 0;i <= 100;i++){
            for(int j = 0;j <= 100;j++){
                if(j*j-i*i==68){
                    System.out.println(j*j-168);
                }
            }
        }


    }
    //输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
    public static int method(int n){
        if(n==1||n==2){
            return 1;
        }else{
            int d1 = 1;
            int d2 = 1;
            int num ;
            for(int i = 3;i <= n;i++){
                num = d1+d2;
                d1 = d2;
                d2 = num;
            }
            return d2;
        }
    }
    //n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
    public static int baoshu(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= n;i++ ){
            list.add(i);
        }
        int m = 1;
        while(list.size()>1){
            if(m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else{
                list.remove(0);
                m=1;
            }
        }
        return list.get(0);
    }
}
