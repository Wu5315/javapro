package com.wu.dao;


import com.wu.pojo.Student1;

import java.util.List;

public interface IstudentDao1 {
    List<Student1> query();
    int add(Student1 student1);
    int update(Student1 student1);
    int del(int Sno);
}
