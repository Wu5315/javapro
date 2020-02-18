package com.wu.web;

import com.wu.pojo.Student;
import com.wu.service.IstudentService;
import com.wu.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1-----------------------查询");
        System.out.println("2-----------------------添加");
        System.out.println("3-----------------------修改");
        System.out.println("4-----------------------删除");
        System.out.println("其他--------------------退出");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            add(scanner);
        }else if(i==3){
            update(scanner);
        }else if(i==4){
            del(scanner);
        }else{
            System.exit(0);
        }
    }
    public void query(){
        //要调用服务层方法
        List<Student> list = studentService.query();
        for(Student student : list){
            System.out.println(student);
        }
        input();
    }
    public void add(Scanner scanner){
        System.out.println("请输入要添加的学生姓名：");
        String Sname = scanner.next();
        System.out.println("请输入要添加的学生性别：");
        String Ssex = scanner.next();
        System.out.println("请输入要添加的学生年龄：");
        int Sage = scanner.nextInt();
        System.out.println("请输入要添加的学生院系：");
        String Sdept = scanner.next();
        //调用服务层方法
        Student student = new Student(Sname,Ssex,Sage,Sdept);
        studentService.add(student);
        query();
    }
    public void update(Scanner scanner){
        System.out.println("请输入要修改的学生学号：");
        int Sno = scanner.nextInt();
        System.out.println("请输入要修改的学生姓名：");
        String Sname = scanner.next();
        System.out.println("请输入要修改的学生性别：");
        String Ssex = scanner.next();
        System.out.println("请输入要修改的学生年龄：");
        int Sage = scanner.nextInt();
        System.out.println("请输入要修改的学生院系：");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        studentService.update(student);
        query();
    }
    public void del(Scanner scanner){
        System.out.println("请输入要删除的学生学号：");
        int Sno = scanner.nextInt();
        studentService.del(Sno);
        query();
    }
}
