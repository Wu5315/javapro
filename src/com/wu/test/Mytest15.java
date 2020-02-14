package com.wu.test;

import java.io.*;

public class Mytest15 {
    public static void main(String[] args) {
        //File
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
        //字节输出流
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

    }
}
