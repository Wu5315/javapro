package com.wu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil1 {
    private static final String URL = "jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static int executeUpdate(String sql,Object... params){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result  = 0;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0;i < params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }

    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list  = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt  = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0;i < params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while(rs.next()){
                T t = clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                for(Field f : fields){
                    String column = f.getName();
                    if(f.isAnnotationPresent(Column1.class)){
                        Column1 c = f.getAnnotation(Column1.class);
                        column = c.value();
                    }
                    Object value = rs.getObject(column);
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt,rs);
        }
        return list;
    }

    public static void close(Connection con,PreparedStatement pstmt){
        try {
            if(pstmt != null)
                pstmt.close();
            if(con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if(rs != null)
                rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
