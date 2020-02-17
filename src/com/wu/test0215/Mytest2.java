package com.wu.test0215;

public class Mytest2 {
    public static void main(String[] args) {
//        Mytest3 t1= new Mytest3();
//        t1.start();
//        Mytest3 t2 = new Mytest3();
//        t2.start();
//        Mytest4 mytest4 = new Mytest4();
//        Thread t1 = new Thread(mytest4);
//        t1.start();
//        Thread t2 = new Thread(mytest4);
//        t2.start();
        Thread thread = new Thread(()->{
            Object object = new Object();
            int a = 80;
            while(a>0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+"卖出了第"+a+"张票");
                    a--;
                }
            }
        });
        thread.start();
    }
}
