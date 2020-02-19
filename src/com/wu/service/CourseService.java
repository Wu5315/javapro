package com.wu.service;

import com.wu.dao.CourseDao;
import com.wu.pojo.Course;

import java.util.List;

public class CourseService implements IcourseService{
    CourseDao courseDao = new CourseDao();
    @Override
    public List<Course> query() {
        return courseDao.query();
    }

    @Override
    public int add() {
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int del() {
        return 0;
    }
}
