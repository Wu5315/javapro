package com.wu.service;

import com.wu.pojo.Course;

import java.util.List;

public interface IcourseService {
    List<Course> query();
    int add();
    int update();
    int del();
}
