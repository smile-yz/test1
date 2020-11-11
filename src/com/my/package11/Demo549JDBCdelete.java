package com.my.package11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo549JDBCdelete {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "delete from account where name='王五'";
            conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&&useSSL=false","root","123456");
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);
            if(count > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }

        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(stmt != null) {
                try {
                    stmt.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }



        }
    }
}
