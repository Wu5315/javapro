package com.wu.dao;

import com.wu.pojo.Student1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao1 implements IstudentDao1{
    String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";
    @Override
    public List<Student1> query() {
        List<Student1> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from Student");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Student1 student1 = new Student1();
                student1.setSno(rs.getInt("Sno"));
                student1.setSname(rs.getString("Sname"));
                student1.setSsex(rs.getString("Ssex"));
                student1.setSage(rs.getInt("Sage"));
                student1.setSdept(rs.getString("Sdept"));
                list.add(student1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs != null)
                    rs.close();
                if(pstmt !=null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student1 student1) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?)");
            pstmt.setString(1,student1.getSname());
            pstmt.setString(2,student1.getSsex());
            pstmt.setInt(3,student1.getSage());
            pstmt.setString(4,student1.getSdept());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt !=null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student1 student1) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("update Student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=? ");
            pstmt.setString(1,student1.getSname());
            pstmt.setString(2,student1.getSsex());
            pstmt.setInt(3,student1.getSage());
            pstmt.setString(4,student1.getSdept());
            pstmt.setInt(5,student1.getSno());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt !=null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int del(int Sno) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("delete from Student where Sno=? ");
            pstmt.setInt(1,Sno);
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt !=null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
