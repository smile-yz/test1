package com.my.package11;

import java.sql.*;

public class Demo549JDBCResultSet {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "select * from account";
            //3.获取Connection对象
            conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&&useSSL=false","root","123456");
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果
            //6.1让游标向下移动一行
//            rs.next();
            //6.2获取数据
//            int id = rs.getInt(1);
//            String name = rs.getString("name");
//            double balance = rs.getDouble("balance");
//            System.out.println(id + "-------" + name + "-------" + balance);

            while(rs.next()) {
                int id1 = rs.getInt("id");
                String name1 = rs.getString("name");
                double balance1 = rs.getDouble("balance");
                System.out.println(id1 + "-------" + name1 + "-------" + balance1);
            }


        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
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
