package com.wu.test;

public class Mytest14 {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();
//        Runnable myThread1 = new MyThread1();
//        Thread t1 = new Thread(myThread1);
//        Thread t2 = new Thread(myThread1);
//        t1.start();
//        t2.start();
        MyThread1 myThread1 = new MyThread1();
        Thread t1 = new Thread(()->{
            myThread1.add();
        });
        Thread t2 = new Thread(()->{
            myThread1.daa();
        });
        t1.start();
        t2.start();
    }
}
