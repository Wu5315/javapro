package com.wu.test;

import java.io.*;

public class Mytest15 {
    public static void main(String[] args) {
//        File
//        File file = new File("d:/a/b");
//        file.exists();//文件是否存在
//        file.mkdirs();//创建全部目录
//        file.mkdir();//创建最后一级目录
//        file.getName();//获取文件名
//        file.delete();//删除文件
//        file.length();//获取文件大小
//        try {
//            file.createNewFile();//新建文件
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        字节输出流
//        File file = new File("d:/student");
//        OutputStream outputStream = null;
//        try {
//            file.createNewFile();
//           outputStream = new FileOutputStream(file);
//           String n = "sadbasbdasbdasbdusadasojdajdbaj";
//           outputStream.write(n.getBytes());
//           outputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(outputStream != null) {
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        //字节输入流
//        File file = new File("d:/student");
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            byte[] n = new byte[10];
//            int b = inputStream.read(n);
//            while(b != -1){
//                System.out.println(new String(n,0,b));
//                b = inputStream.read(n);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                 if(inputStream != null)
//                    inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //字符输入流
//        File file = new File("d:/student");
//        Reader reader = null;
////        char[] a= new char[10];
//        BufferedReader bufferedReader = null;
//        try {
//            reader = new FileReader(file);
//            bufferedReader = new BufferedReader(reader);
//            String a = bufferedReader.readLine();
//            while(a!=null){
//                System.out.println(a);
//                a = bufferedReader.readLine();
//            }
////            int b = reader.read(a);
////            while(b != -1){
////                System.out.println(new String(a,0,b));
////                b = reader.read(a);
////            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(bufferedReader != null)
//                    bufferedReader.close();
//                if(reader != null)
//                    reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //字符输出流
        File file = new File("d:/student");
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);//输出流一定注意，是覆盖还是追加
            writer.write("\nasdshuhfdufhsud");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
