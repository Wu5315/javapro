package com.wu.test;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
//        Dog d = new Dog("saneryi",20);
//        d.setAge(200);
//        System.out.println(d.getAge());
//        System.out.println(d.getName());
//        d.run();
//        String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123456";
//        Connection con = null;
//        PreparedStatement pstmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url,username,password);
//            pstmt = con.prepareStatement("insert into Student(Sname,Ssex,Sage) values('李四','男',18)");
//            int i = pstmt.executeUpdate();
//            System.out.println(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(pstmt != null)
//                    pstmt.close();
//                if(con != null)
//                    con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123456";
//        Connection con = null;
//        PreparedStatement pstmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url,username,password);
//            pstmt = con.prepareStatement("insert into Student(Sname,Ssex,Sage) values('王五','男',18)");
//            int i = pstmt.executeUpdate();
//            System.out.println(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(pstmt != null)
//                    pstmt.close();
//                if(con != null)
//                    con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123456";
//        Connection con = null;
//        PreparedStatement pstmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url,username,password);
//            pstmt = con.prepareStatement("update Student set Sname='李四',Ssex='女',Sage=18 where Sno=3");
//            int i = pstmt.executeUpdate();
//            System.out.println(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                if(pstmt != null)
//                    pstmt.close();
//                if(con != null)
//                    con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123456";
//        Connection con = null;
//        PreparedStatement pstmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url,username,password);
//            pstmt = con.prepareStatement("delete from Student where Sno=4");
//            int i = pstmt.executeUpdate();
//            System.out.println(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                if(pstmt != null)
//                    pstmt.close();
//                if(con != null)
//                    con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        String url = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select * from Student");
            ResultSet a = pstmt.executeQuery();
            while(a.next()){
                int Sno = a.getInt(1);
                String Sname = a.getString(2);
                String Ssex = a.getString(3);
                int Sage = a.getInt(4);
                String Sdept = a.getString(5);
                System.out.println(Sno+"-->"+Sname+"-->"+Ssex+"-->"+Sage+"-->"+Sdept);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
