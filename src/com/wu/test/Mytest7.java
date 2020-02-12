package com.wu.test;


import java.io.*;

public class Mytest7 {
    public static void main(String[] args) {
//        File from = new File("d:/2 File类.wmv");
//        File parent = new File("d:/a");
//        if(!parent.exists()){
//            parent.mkdirs();
//        }
//        File to = new File("d:/a/"+from.getName());
//        InputStream inputStream = null;
//        OutputStream outputStream = null;
//        byte[] b = new byte[1024];
//        try {
//            inputStream = new FileInputStream(from);
//            outputStream = new FileOutputStream(to);
//            int len = inputStream.read(b);
//            while(len != -1){
//                outputStream.write(b,0,len);
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
//                if(inputStream != null);
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
//        File file = new File("d:/student");
//        OutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(student);
//            objectOutputStream.flush();
//            System.out.println("保存完成");
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
        File file = new File("d:/student");
        InputStream inputStream = null;
         ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(objectInputStream != null)
                    objectInputStream.close();
                if(inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
