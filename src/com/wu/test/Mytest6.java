package com.wu.test;

import java.io.*;

public class Mytest6 {
    public static void main(String[] args) {
        File file = new File("d:/Test.java");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        OutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(file,true);
//            String a = "jksadasjbasobaso";
//            outputStream.write(a.getBytes());
//            outputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//                try {
//                    if(outputStream!=null)
//                      outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//        }
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            byte[] a = new byte[10];
//            int b = inputStream.read(a);
//            while(b != -1){
//                System.out.println(new String(a));
//                b = inputStream.read(a);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(inputStream!=null){
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        char[] a = new char[10];
//        Reader reader =null;
//        BufferedReader br = null;
//        try {
//            reader = new FileReader(file);
//            br = new BufferedReader(reader);
//            int b = reader.read(a);
//            while(b != -1){
//                System.out.println("输出读取字符数："+b);
//                System.out.println(new String(a,0,b));
//                b = reader.read(a);
//            }
//            String str = br.readLine();
//            while(str != null){
//                System.out.println(str);
//                str = br.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(br != null){
//                    br.close();
//                }
//                if(reader != null)
//                    reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("askhdasjhdjadhka");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
