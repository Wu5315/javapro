package com.wu.test0215;

public class Mytest4 implements Runnable{
    private Integer a = 80;
    Object object = new Object();
    @Override
    public void run() {
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
    }
}
