package com.wu.service;

import com.wu.pojo.Student;

import java.util.List;

public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student queryone(int Sno);
}
