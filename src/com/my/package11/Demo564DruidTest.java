package com.my.package11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo564DruidTest {
    public static void main(String[] args) {
        /*
        完成添加操作：给account表添加一条记录
         */
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            //1.获取连接
            conn = Demo563JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(default,?,?)";
            //3.获取Stmt对象
            pstmt = conn.prepareStatement(sql);
            //4.赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,1000);
            //5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Demo563JDBCUtils.close(pstmt,conn);
        }

    }
}
