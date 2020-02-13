package com.wu.test;

import java.io.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Mytest10 {
    private static int a = 0;
    private static Object object = new Object();
    public static void main(String[] args) {
//        File from = new File("d:/2 File类.wmv");
//        File doc = new File("d:/a/b");
//        File to = new File("d:/a/b/"+from.getName());
//        if(!doc.exists()){
//            doc.mkdirs();
//        }
//        InputStream inputStream =null;
//        OutputStream outputStream =null;
//        try {
//            inputStream = new FileInputStream(from);
//            outputStream = new FileOutputStream(to);
//
//            byte[] b = new byte[1024];
//            int len = inputStream.read(b);
//            while(len != -1){
//                outputStream.write(b);
//                outputStream.flush();
//                len = inputStream.read(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(outputStream != null)
//                    outputStream.close();
//                if(inputStream != null)
//                    inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        Student student = new Student();
//        student.setAge(20);
//        student.setId(10);
//        student.setName("张三");
//        student.setGrade("卓越一班");
//        File file = new File("d:/a/student");
//        OutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(student);
//            objectOutputStream.flush();
//            System.out.println("保存完成");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(objectOutputStream != null)
//                    objectOutputStream.close();
//                if(outputStream != null)
//                    outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        File file = new File("d:/a/student");
//        InputStream inputStream = null;
//        ObjectInputStream objectInputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            objectInputStream = new ObjectInputStream(inputStream);
//            Student student = (Student) objectInputStream.readObject();
//            System.out.println(student);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                if(objectInputStream != null)
//                    objectInputStream.close();
//                if(inputStream != null)
//                    inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        MyAdd myAdd = new MyAdd();
//        MyJian myJian = new MyJian();
//        Mycheng mycheng = new Mycheng();
//        Mychu mychu = new Mychu();
//        System.out.println(myAdd.method(10,2));
//        System.out.println(mycheng.method(10,2));
//        System.out.println(mychu.method(10,2));
//        System.out.println(myJian.method(10,2));
//        System.out.println(jisuan(10,2,myAdd));
//        System.out.println(jisuan(10,2,mycheng));
//        System.out.println(jisuan(10, 2, new MyInterface() {
//            @Override
//            public int method(int a, int b) {
//                return a-b;
//            }
//        }));
//        System.out.println(jisuan(10,2,(a,b)->{
//            return a/b;
//        }));
//        MyThread t1 = new MyThread();
//        t1.start();
//        MyThread t2 = new MyThread();
//        t2.start();
//        MyThread1 t1 = new MyThread1();
//        Thread t2 = new Thread(t1);
//        t2.start();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0;i <= 100;i++){
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"线程输出:"+i);
//                }
//            }
//        });
//        Thread t1 = new Thread(()->{
//            for(int i = 0;i <= 100;i++){
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"线程输出:"+i);
//                }
//        });
//        t1.start();
        CountDownLatch countDownLatch = new CountDownLatch(5000);
        Semaphore semaphore = new Semaphore(1);
        for(int i = 0;i < 5000;i++){
            Thread t = new Thread(()->{
//                synchronized (object){
                try {
                    semaphore.acquire();
                    a++;
                    countDownLatch.countDown();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                }
            });
            t.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
//    public static int jisuan(int a,int b,MyInterface myInterface){
//        return myInterface.method(a,b);
//    }

}
