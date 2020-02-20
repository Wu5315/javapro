package com.wu.dao;

import com.wu.pojo.Course;
import com.wu.service.IcourseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao implements IcourseService {
    private String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
    private String username = "root";
    private String password = "123456";
    @Override
    public List<Course> query() {
        List<Course> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select Cno,Cname,Period,Ccredit from Course");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Course course = new Course();
                course.setCno(rs.getInt("Cno"));
                course.setCname(rs.getString("Cname"));
                course.setPeriod(rs.getInt("Period"));
                course.setCcredit(rs.getInt("Ccredit"));
                list.add(course);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)
                    rs.close();
                if(pstmt != null)
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
    public int add(Course course) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insertinsert into Course(Cno,Cname,Period,Ccredit) values(?,?,?,?) ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Course course) {
        return 0;
    }

    @Override
    public int del(int Cno) {
        return 0;
    }
}
