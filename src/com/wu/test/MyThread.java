package com.wu.test;

public class MyThread extends Thread{
    private int count = 40;
    @Override
    public void run() {
//       for(int i = 0;i <= 100;i++){
//           try {
//               Thread.sleep(500);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//           System.out.println(Thread.currentThread().getName()+"线程输出:"+i);
//       }
        while(count>0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"已卖出第"+count+"张票");
            count--;
        }
    }
}
