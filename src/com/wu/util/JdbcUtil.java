package com.wu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL="jdbc:mysql://192.168.254.128:3306/adc?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    //加载驱动 ，加载一次
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //连接数据库
    public static Connection getConnection(){
        Connection con = null;
        try {
            con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //增删改，都返回一个int值
    public static int executeUpdate(String sql,Object... params){
        int result  = 0;
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0;i < params.length;i++){
                    pstmt.setObject(i+1,params[i]);//因为不知道set什么数据类型，所以用Object
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
    //封装通用查询      反射
    public static <T> List <T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
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
                //创建一个T类型的对象
                T t = clz.newInstance();//调用该类的无参构造创建一个该类的对象
                Field[] fields = clz.getDeclaredFields();
                for(Field f : fields){
                    String column = f.getName();
                    if(f.isAnnotationPresent(Column.class)){
                        Column  c =  f.getAnnotation(Column.class);
                        column = c.value();
                    }//判断该属性下有没有注解，返回Boolean值
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

    //封装通用查询2     匿名内部类
    public static <T> List<T> executeQuery(String sql, RowMap<T> rowMap,Object... params){
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0;i < params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
               T t =  rowMap.Rowmathod(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    //封装关闭
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
