package com.wu.work3a;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Mybook> mybooks = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void inputData(List<Mybook> books){
        System.out.println("请输入初始化添加的书本数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            Mybook mybook = new Mybook("水浒"+i,15.0,"出版社"+i,"作者"+i,"ISBN"+i);
            mybooks.add(mybook);
        }
        System.out.println("初始化完成，进入主界面");
        menu1();
    }
    public static void print(List<Mybook> books){
        for (int i = 0;i < mybooks.size();i++){
            System.out.println(mybooks.get(i));
        }
        menu1();
    }
    public static void searchName(List<Mybook> books){
        System.out.println("请输入要查找的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0;i < mybooks.size();i++){
            Mybook mybook = mybooks.get(i);
            if(mybook.getName().equals(name)){
                System.out.println(mybook);
                menu1();
                return;
            }
        }
        System.out.println("此书不存在");
        menu1();
    }
    public static void deleteName(List<Mybook> books){
        System.out.println("请输入要删除的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0;i < mybooks.size();i++){
            Mybook mybook =  mybooks.get(i);
            if(mybook.getName().equals(name)){
                mybooks.remove(i);
                System.out.println("此书删除成功。");
                menu1();
                return;
            }
        }
        System.out.println("没有此书，删除失败.");
        menu1();
    }
    public static void add(){
        System.out.println("请输入添加书本数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            System.out.println("请输入第"+(i+1)+"本书的信息");
            System.out.println("请输入书名");
            String name = scanner.next();
            System.out.println("请输入价格");
            Double price = scanner.nextDouble();
            System.out.println("请输入出版社");
            String press = scanner.next();
            System.out.println("请输入作者");
            String author = scanner.next();
            System.out.println("请输入ISBN号");
            String bookIBSN = scanner.next();
            Mybook mybook = new Mybook(name,price,press,author,bookIBSN);
            mybooks.add(mybook);
        }
        System.out.println("添加完成");
        menu1();
    }
    public static void menu1(){
        System.out.println("请选择你要进行的操作（请输入1-5中的任一个数字）:");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看图书");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                add();
                break;
            case 2:
                deleteName(mybooks);
                break;
            case 3:
                searchName(mybooks);
                break;
            case 4:
                print(mybooks);
                break;
            default:
                System.exit(1);
                break;
        }
    }
    public static void menu(){
        System.out.println("是否初始化图书列表（请输入1或2）");
        System.out.println("1.初始化");
        System.out.println("2.跳过");
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        if(a == 1){
            inputData(mybooks);
        }else if(a == 2){
            menu1();
        }else{
            System.out.println("输入错误，请重新输入：");
            menu();
        }
    }
}
