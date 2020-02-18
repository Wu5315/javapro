package com.wu.web;

import com.wu.pojo.Student;
import com.wu.pojo.Student1;
import com.wu.service.StudentService1;

import java.util.List;
import java.util.Scanner;

public class StudentWeb1 {
    StudentService1 studentService1 = new StudentService1();
    public void showmain(){
        System.out.println("***********************************************");
        System.out.println("*                    1. 查询                  *");
        System.out.println("*                    2. 添加                  *");
        System.out.println("*                    3. 修改                  *");
        System.out.println("*                    4. 删除                  *");
        System.out.println("*                    5. 退出                  *");
        System.out.println("***********************************************");
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
        List<Student1> list  = studentService1.query();
        for(Student1 i : list){
            System.out.println(i);
        }
    }

    public void add(Scanner scanner){
        System.out.println("请输入要添加的学生的姓名：");
        String Sname = scanner.next();
        System.out.println("请输入要添加的学生的性别：");
        String Ssex = scanner.next();
        System.out.println("请输入要添加的学生的年龄：");
        int Sage = scanner.nextInt();
        System.out.println("请输入要添加的学生的院系：");
        String Sdept = scanner.next();
        Student1 student1 = new Student1(Sname,Ssex,Sage,Sdept);
        studentService1.add(student1);
        query();
    }

    public void update(Scanner scanner){
        System.out.println("请输入要修改的学生的学号：");
        int Sno = scanner.nextInt();
        System.out.println("请输入要修改的学生的姓名：");
        String Sname = scanner.next();
        System.out.println("请输入要修改的学生的性别：");
        String Ssex = scanner.next();
        System.out.println("请输入要修改的学生的年龄：");
        int Sage = scanner.nextInt();
        System.out.println("请输入要修改的学生的院系：");
        String Sdept = scanner.next();
        Student1 student1 = new Student1(Sno,Sname,Ssex,Sage,Sdept);
        studentService1.update(student1);
        query();
    }

    public void del(Scanner scanner){
        System.out.println("请输入要删除的学生的学号：");
        int Sno = scanner.nextInt();
        studentService1.del(Sno);
        query();
    }
}
