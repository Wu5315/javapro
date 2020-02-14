package com.wu.work3a;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookmain {
    private static List<Books> books = new ArrayList<>();
    private static  File file = new File("d:/a/books");
    public static void main(String[] args) {
        if(!file.exists()){
            inputData(books);
            save();
        }else{
            read();
        }
        menu(books);
    }
    public static void inputData(List<Books> list){
        System.out.println("请输入初始化书本数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1;i <= n;i++){
            Books book = new Books("三国"+i,15.0,"西游记出版社","孙悟空","SWK00"+i);
            list.add(book);
        }
        System.out.println("初始化完成！");
    }
    public static void print(List<Books> list){
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        menu(list);
    }
    public static void searchName(List<Books> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的书名：");
        String name = scanner.next();
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
                menu(list);
                return;
            }
        }
        System.out.println("此书不存在！");
        menu(list);
    }
    public static void deleteName(List<Books> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书名：");
        String name = scanner.next();
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                System.out.println("删除成功");
                save();
                menu(list);
                return;
            }
        }
        System.out.println("此书不存在，删除失败！");
        menu(list);
    }
    public static void add(List<Books> list){
        System.out.println("请输入要添加的书本数：");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            System.out.println("请输入第"+(i+1)+"本数的信息：");
            System.out.println("请输入书名：");
            String name = scanner.next();
            System.out.println("请输入价格：");
            Double price  = scanner.nextDouble();
            System.out.println("请输入出版社：");
            String press = scanner.next();
            System.out.println("请输入作者：");
            String author = scanner.next();
            System.out.println("请输入bookISBN：");
            String ISBN = scanner.next();
            Books books = new Books(name,price,press,author,ISBN);
            list.add(books);
        }
        System.out.println("添加完成！");
        save();
        menu(list);
    }
    public static void menu(List<Books> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择你要进行的操作（请输入1-5中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        int n = scanner.nextInt();
        if(n==1)
            add(list);
        else if(n==2)
            deleteName(list);
        else if(n==3)
            searchName(list);
        else if(n==4)
            print(list);
        else
            System.exit(1);
//        switch(n){
//            case 1:
//                add(list);
//                break;
//            case 2:
//                deleteName(list);
//                break;
//            case 3:
//                searchName(list);
//                break;
//            case 4:
//                print(list);
//                break;
//            default:
//                System.exit(1);
//                break;
//        }

    }
    public static void save(){
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(objectOutputStream != null)
                    objectOutputStream.close();
                if(outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void read(){
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            books = (List<Books>)objectInputStream.readObject();
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
