package com.wu.dao;

import com.wu.pojo.Student;

import java.util.List;

public interface IstudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student queryone(int Sno);
}
