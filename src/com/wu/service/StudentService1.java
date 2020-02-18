package com.wu.service;

import com.wu.dao.StudentDao1;
import com.wu.pojo.Student1;

import java.util.List;

public class StudentService1 implements IstudentService1{
    StudentDao1 studentDao1 = new StudentDao1();
    @Override
    public List<Student1> query() {
        return studentDao1.query();
    }

    @Override
    public int add(Student1 student1) {
        return studentDao1.add(student1);
    }

    @Override
    public int update(Student1 student1) {
        return studentDao1.update(student1);
    }

    @Override
    public int del(int Sno) {
        return studentDao1.del(Sno);
    }
}
