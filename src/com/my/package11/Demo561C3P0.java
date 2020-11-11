package com.my.package11;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo561C3P0 {
    public static void main(String[] args) throws SQLException {
        //1.获取DataSource，使用默认值
        DataSource ds = new ComboPooledDataSource();
        //2.获取连接
        for (int i = 1;i <= 11;i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + "====" + conn);

            if(i == 5) {
                conn.close();
            }
        }
        System.out.println("==================================");
        testNameConfig();
    }

    public static void testNameConfig() throws SQLException {
        //1.获取DataSource，使用指定配置名
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接
        for (int i = 1;i <= 8;i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + "====" + conn);

//            if(i == 5) {
//                conn.close();
//            }
        }
    }
}
