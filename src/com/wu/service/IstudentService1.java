package com.wu.service;

import com.wu.pojo.Student1;

import java.util.List;

public interface IstudentService1 {
    List<Student1> query();
    int add(Student1 student1);
    int update(Student1 student1);
    int del(int Sno);
}
