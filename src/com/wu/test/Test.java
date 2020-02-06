package com.wu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        //分别传入100000个数，返回时间差
        //在尾部添加
        Date startarray = new Date();//获取开始时的时间
        for(int i = 1;i <= 100000;i++){
            arrayList.add(i);
        }
        Date endarray = new Date();//获取结束时的时间
        System.out.println("arrayList尾部添加的时间="+(endarray.getTime()-startarray.getTime()));
        Date startlinked = new Date();
        for(int i = 1;i <= 100000;i++){
            linkedList.add(i);
        }
        Date endlinked = new Date();
        System.out.println("linkedList尾部添加的时间="+(endlinked.getTime()-startlinked.getTime()));

        //在中间添加
//        Date startarray1 = new Date();//获取开始时的时间
//        for(int i = 1;i <= 100000;i++){
//            arrayList.add(0,i);
//        }
//        Date endarray1 = new Date();//获取结束时的时间
//        System.out.println("arrayList中间添加的时间="+(endarray1.getTime()-startarray1.getTime()));
//        Date startlinked1 = new Date();
//        for(int i = 1;i <= 100000;i++){
//            linkedList.add(0,i);
//        }
//        Date endlinked1 = new Date();
//        System.out.println("linkedList中间添加的时间="+(endlinked1.getTime()-startlinked1.getTime()));

        //测试读取性能
        Date startarray2 = new Date();//获取开始时的时间
        for(int i = 0;i <  arrayList.size();i++){
            Object a = arrayList.get(i);
        }
        Date endarray2 = new Date();//获取结束时的时间
        System.out.println("arrayList的读取时间="+(endarray2.getTime()-startarray2.getTime()));
        Date startarray3 = new Date();//获取开始时的时间
        for(int i = 0;i <  linkedList.size();i++){
            Object b = linkedList.get(i);
        }
        Date endarray3 = new Date();//获取结束时的时间
        System.out.println("linkedList的读取时间="+(endarray3.getTime()-startarray3.getTime()));
    }
}
