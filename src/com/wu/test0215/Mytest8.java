package com.wu.test0215;

import com.wu.pojo.Student;
import com.wu.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mytest8 {
    public static void main(String[] args) {
//        int[] a ={10,9,8,7,6,5,4,3,2,1};
//        for(int i = 0;i < a.length;i++){
//            boolean flag = true;
//            for(int j = 0;j < a.length-1-i;j++){
//                if(a[j] > a[j+1]){
//                    int temp = a[j+1];
//                    a[j+1] = a[j];
//                    a[j] = temp;
//                    flag = false;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
//        for(int i : a){
//            System.out.println(i);
//        }
//        Connection con = JdbcUtil.getConnection();
//        PreparedStatement pstmt = null;
//        PreparedStatement pstmt2 = null;
//        try {
//            con.setAutoCommit(false);
//            pstmt = con.prepareStatement("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?)");
//            pstmt.setString(1,"王二");
//            pstmt.setString(2,"男");
//            pstmt.setInt(3,22);
//            pstmt.setString(4,"不知道");
//            pstmt2 = con.prepareStatement("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?)");
//            pstmt2.setString(1,"王三");
//            pstmt2.setString(2,"女");
//            pstmt2.setInt(3,33);
//            pstmt2.setString(4,"也不知道");
//            int i = pstmt.executeUpdate();
//            System.out.println(i);
//            int a= 100/0;
//            int j = pstmt2.executeUpdate();
//            System.out.println(j);
//            con.commit();
//        } catch (SQLException e) {
//            try {
//                con.rollback();
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//            e.printStackTrace();
//        }finally {
//            try {
//                if(pstmt2 != null)
//                    pstmt2.close();
//                JdbcUtil.close(con,pstmt);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{
            shiwu1();
        });
        service.execute(()->{
            shiwu2();
        });
        service.shutdown();
    }

    public static void shiwu1(){
        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        try {
            con.setAutoCommit(false);
            Thread.sleep(1000);
            pstmt = con.prepareStatement("insert into Student(Sname,Ssex,Sage,Sdept) value(?,?,?,?)");
            pstmt.setString(1,"王二");
            pstmt.setString(2,"男");
            pstmt.setInt(3,22);
            pstmt.setString(4,"不知道");
            int i = pstmt.executeUpdate();
            System.out.println(i);
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(con,pstmt);
        }
    }

    public static void shiwu2(){

        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try {
            con.setAutoCommit(false);
            con.setTransactionIsolation(4);
            pstmt = con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from Student");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSsex(rs.getString("Ssex"));
                student.setSage(rs.getInt("Sage"));
                student.setSdept(rs.getString("Sdept"));
                System.out.println(student);
            }
            Thread.sleep(3000);
            pstmt2 = con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from Student");
            rs = pstmt2.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSsex(rs.getString("Ssex"));
                student.setSage(rs.getInt("Sage"));
                student.setSdept(rs.getString("Sdept"));
                System.out.println(student);
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(pstmt2 != null) {
                try {
                    pstmt2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            JdbcUtil.close(con,pstmt,rs);
        }
    }
}
