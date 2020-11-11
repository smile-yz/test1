package com.my.package11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo556JDBCTransaction {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        PreparedStatement pstmt3 = null;
        ResultSet rs = null;

        try {
            //1.获取连接方式

            conn = Demo552JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            //2.定义sql
            //2.1张三减少500
            //2.2李四增加500
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            String sql3 = "select * from account";
            //3.获取sql执行对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt3 = conn.prepareStatement(sql3);

            //4.设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);


            //执行
            pstmt1.executeUpdate();
            int i = 3/0;

            pstmt2.executeUpdate();
            conn.commit();
            rs = pstmt3.executeQuery();

            while(rs.next()) {
                int id1 = rs.getInt("id");
                String name1 = rs.getString("name");
                Double balance1 = rs.getDouble("balance");
                System.out.println(id1 + "========" + name1 + "========" + balance1);
            }

        } catch(Exception e ) {
            try {
                if(conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            Demo552JDBCUtils.close(pstmt1,conn);
            Demo552JDBCUtils.close(rs,pstmt2,null);
        }
    }
}
