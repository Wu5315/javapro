package com.wu.test;

public class Mytest8 {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        MyThread t2 = new MyThread();
//        t2.start();
//        MyThread1 t2 = new MyThread1();
//        Thread t = new Thread(t2);
//        t.start();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0;i <= 100;i++){
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"线程正在输出："+i);
//                }
//            }
//        });
        Thread t1 = new Thread(()->{
            for(int i = 0;i <= 100;i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程正在输出："+i);
            }
        });
        t1.start();
    }
}
