package com.wu.web;

import com.wu.pojo.Course;
import com.wu.service.CourseService;

import java.util.List;
import java.util.Scanner;

public class CourseWeb {
    CourseService courseService = new CourseService();
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
        System.out.println("请输入要进行的操作：");
        int i = scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            System.out.println("tanjia");
        }else if(i==3){
            System.out.println("xiugai");
        }else if(i==4){
            System.out.println("shanchu");
        }else{
            System.exit(0);
        }
    }

    public void query(){
        //调用service层的代码
        List<Course> list = courseService.query();
        for( Course i : list){
            System.out.println(i);
        }
    }

    public void add(Scanner scanner){
        System.out.println("请输入要添加的课程号：");
        int Cno = scanner.nextInt();
        System.out.println("请输入要添加的课程名称：");
        String Cname = scanner.next();
        System.out.println("请输入本课程学时：");
        int Period = scanner.nextInt();
        System.out.println("请输入本课程学分：");
        int Ccredit = scanner.nextInt();
        Course course = new Course(Cno,Cname,Period,Ccredit);
        //调用seriver添加方法
        courseService.add(course);
    }
}
