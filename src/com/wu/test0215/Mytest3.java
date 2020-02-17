package com.wu.test0215;

public class Mytest3 extends Thread{
    private Integer a = 80;
    @Override
    public void run() {
        while(a>0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖出了第"+a+"张票");
            a--;
        }
    }
}
