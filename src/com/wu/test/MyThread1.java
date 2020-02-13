package com.wu.test;

public class MyThread1 implements Runnable{
    private int count = 100;
    Object object = new Object();
    @Override
    public void run() {
//        for(int i = 0;i <= 100;i++){
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"线程输出:"+i);
//        }

        while(count>0){
            synchronized (object){
                System.out.println(Thread.currentThread().getName()+"已卖出第"+count+"张票");
                count--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public synchronized void add(){
        while(true){
            System.out.println("add");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void daa(){
        while(true){
            System.out.println("daaqqqqqq");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
