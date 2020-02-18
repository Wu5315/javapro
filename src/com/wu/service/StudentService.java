package com.wu.service;

import com.wu.dao.StudentDao;
import com.wu.pojo.Student;

import java.util.List;

public class StudentService implements IstudentService{
    StudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int Sno) {
        return studentDao.del(Sno);
    }

    @Override
    public Student queryone(int Sno) {
        return null;
    }
}
