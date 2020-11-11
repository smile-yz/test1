package com.my.package11;

import java.sql.*;
import java.util.Scanner;

public class Demo553JDBC {
    public static void main(String[] args) {
        //1.键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String user = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        //2.调用方法
        boolean b = new Demo553JDBC().login1(user,password);
        //3.判断结果，输出不同语句
        if(b) {
            System.out.println("登录成功！");
        }else{
            System.out.println("用户名或密码错误！");
        }

    }

    public boolean login(String name,String password) {
        if(name == null && password == null) {
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.获取连接
            conn = Demo552JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username = '" +name+"' and password = '"+password+"'";
            System.out.println(sql);//select * from user where username = 'lisi' and password = '456'
            //3.获取执行sql对象
            stmt = conn.createStatement();
            //4.执行查询
            rs = stmt.executeQuery(sql);
            //5.判断
//            if(rs.next()) {
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();



        } catch(SQLException e) {
            e.printStackTrace();
        }finally{
            Demo552JDBCUtils.close(rs,stmt,conn);
        }

        return false;
    }

    public boolean login1(String name,String password) {
        if(name == null && password == null) {
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection conn = null;
        //Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            conn = Demo552JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username = ? and password = ?";
            System.out.println(sql);//select * from user where username = 'lisi' and password = '456'
            //3.获取执行sql对象
            //stmt = conn.createStatement();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,password);

            //4.执行查询
            //rs = stmt.executeQuery(sql);
            rs = pstmt.executeQuery();
            //5.判断
//            if(rs.next()) {
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();



        } catch(SQLException e) {
            e.printStackTrace();
        }finally{
            Demo552JDBCUtils.close(rs,pstmt,conn);
        }

        return false;
    }
}
