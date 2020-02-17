package com.wu.test0215;

import java.io.*;
import java.util.*;

public class Mytest1 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
//        set.add("12");
//        set.add("56");
//        set.add("777");
//        set.add("33");
//        set.add("88");
//        set.add("123");
//        for(String i : set){
//            System.out.println(i);
//        }
//        Set<Integer> set = new TreeSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(12);
//        set.add(53);
//        set.add(86);
//        set.add(45);
//        set.add(200);
//        set.add(100);
//        for(int i : set){
//            System.out.println(i);
//        }
//        Map<String,String> map = new HashMap<>();
//        map.put("01","张三");
//        map.put("02","李四");
//        map.put("03","王五");
//        System.out.println(map.get("03"));
//        Set<String> a = map.keySet();
//        System.out.println(a);
        //字节输出
//        File file = new File("d:/a/b/student");
//        File to = new File("d:/a/b");
//        if(!to.exists()){
//            to.mkdirs();
//        }
//        OutputStream outputStream = null;
//        try {
//            String b = "bhujiooaskjdhadbadbaodhasud";
//            outputStream = new FileOutputStream(file);
//            outputStream.write(b.getBytes());
//            outputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(outputStream != null)
//                    outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //字节输入
//        File file = new File("d:/a/b/student");
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            byte[] a = new byte[10];
//            int b = inputStream.read(a);
//            while(b != -1){
//                System.out.println("本次读取"+b+"个字节");
//                System.out.println(new String(a,0,b));
//                b = inputStream.read(a);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(inputStream != null)
//                    inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //字符输出
//        File file = new File("d:/a/b/student");
//        Reader reader = null;
//        try {
//            reader = new FileReader(file);
//            char[] b = new char[10];
//            int len = reader.read(b);
//            while(len != -1){
//                System.out.println(new String(b,0,len));
//                len = reader.read(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(reader!=null)
//                    reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //整行输入
//        Reader reader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            reader = new FileReader(file);
//            bufferedReader = new BufferedReader(reader);
//            String  a =bufferedReader.readLine();
//            while(a != null){
//                System.out.println(a);
//                a =bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(bufferedReader!=null)
//                    bufferedReader.close();
//                if(reader != null)
//                    reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //字符输出
//        Writer writer = null;
//        try {
//            writer = new FileWriter(file,true);
//            String a = "\nasahuofhsndoshdhsa";
//            writer.write(a);
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(writer != null)
//                    writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //转移文件
//        File file = new File("d:/6 Linux所需要的环境.wmv");
//        File to = new File("d:/a/6 Linux所需要的环境.wmv");
//        InputStream inputStream = null;
//        OutputStream outputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            outputStream = new FileOutputStream(to);
//            byte[] a = new byte[1024];
//            int b = inputStream.read(a);
//            while(b != -1){
//                outputStream.write(a);
//                outputStream.flush();
//                b = inputStream.read(a);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                if(outputStream != null)
//                    outputStream.close();
//                if(inputStream != null)
//                    inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //java对象持久化
//        Mystudent mystudent = new Mystudent("张三",25,"男","卓越一班");
        File file= new File("d:/Mystudent");
//        OutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(mystudent);
//            objectOutputStream.flush();
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
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Mystudent mystudent= (Mystudent) objectInputStream.readObject();
            System.out.println(mystudent);
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
