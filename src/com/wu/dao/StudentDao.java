package com.wu.dao;

import com.wu.pojo.Student;
import com.wu.util.JdbcUtil;
import com.wu.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao implements IstudentDao{
//    @Override
//    public List<Student> query() {
//        List<Student> list = JdbcUtil.executeQuery("select Sno,Sname,Ssex,Sage,Sdept from Student",Student.class);
//        return list;
//    }
    @Override
    public List<Student> query() {
        List<Student> list = JdbcUtil.executeQuery("select Sno,Sname,Ssex,Sage,Sdept from Student", new RowMap<Student>() {
            @Override
            public Student Rowmathod(ResultSet rs) {
                Student student = new Student();
                try {
                    student.setSno(rs.getInt("Sno"));
                    student.setSname(rs.getString("Sname"));
                    student.setSsex(rs.getString("Ssex"));
                    student.setSage(rs.getInt("Sage"));
                    student.setSdept(rs.getString("Sdept"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return student;
            }
        });
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
