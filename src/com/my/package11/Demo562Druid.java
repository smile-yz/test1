package com.my.package11;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo562Druid {
    public static void main(String[] args) throws Exception {

        //3.加载配置文件
        Properties pro = new Properties();
        InputStream is = Demo562Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //5.获取连接
        for (int i = 1;i <= 10;i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + "====" + conn);
        }

    }
}
