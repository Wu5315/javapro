package com.wu.dao;

import com.wu.pojo.Student1;
import com.wu.util.JdbcUtil;
import com.wu.util.JdbcUtil1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao1 implements IstudentDao1{
    @Override
    public List<Student1> query() {
        List<Student1> list  = JdbcUtil1.executeQuery("select Sno,Sname,Ssex,Sage,Sdept from Student",Student1.class);
        return list;
    }

    @Override
    public int add(Student1 student1) {
        return JdbcUtil1.executeUpdate("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?)",student1.getSname(),student1.getSsex(),student1.getSage(),student1.getSdept());
    }

    @Override
    public int update(Student1 student1) {
        return JdbcUtil1.executeUpdate("update Student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=? ",student1.getSname(),student1.getSsex(),student1.getSage(),student1.getSdept(),student1.getSno());
    }

    @Override
    public int del(int Sno) {
        return JdbcUtil1.executeUpdate("delete from Student where Sno=? ",Sno);
    }
}
