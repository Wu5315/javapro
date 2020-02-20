package com.wu.service;

import com.wu.pojo.Course;

import java.util.List;

public interface IcourseService {
    List<Course> query();
    int add(Course course);
    int update(Course course);
    int del(int Cno);
}
