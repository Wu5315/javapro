package com.wu.dao;

import com.wu.pojo.Course;

import java.util.List;

public interface IcourseDao {
    List<Course> query();
    int add(Course course);
    int update(Course course);
    int del(int Cno);
}
