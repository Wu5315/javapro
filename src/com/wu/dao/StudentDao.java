package com.wu.dao;

import com.wu.pojo.Student;
import com.wu.util.JdbcUtil;

import java.util.List;

public class StudentDao implements IstudentDao{
    @Override
    public List<Student> query() {
        List<Student> list = JdbcUtil.executeQuery("select Sno,Sname,Ssex,Sage,Sdept from Student",Student.class);
        return list;
    }

    @Override
    public int add(Student student) {
        return JdbcUtil.executeUpdate("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?) ",student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
    }

    @Override
    public int update(Student student) {
        return  JdbcUtil.executeUpdate("update  Student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?",student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());
    }

    @Override
    public int del(int Sno) {
        return JdbcUtil.executeUpdate("delete from Student where Sno=?",Sno);
    }

    @Override
    public Student queryone(int Sno) {
        return null;
    }
}
