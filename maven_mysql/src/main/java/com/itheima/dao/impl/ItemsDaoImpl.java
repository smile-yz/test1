package com.itheima.dao.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ItemsDaoImpl implements ItemsDao {
    public List<Items> findAll() throws Exception{
        //把数据库结果集转成java得List集合
        List<Items> list = new ArrayList<Items>();
        //先获取contection对象
        Connection connection = null;
        //获取真正操作数据得对象
        PreparedStatement pst = null;
        //执行数据库查询操作
        ResultSet rs = null;
        try{
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = getConnection("jdbc:mysql://127.0.0.1:3306/day17?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root","123456");

            pst = connection.prepareCall("select * from user ");
            //执行数据库查询操作
            rs = pst.executeQuery();

            while (rs.next()) {
                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));
                list.add(items);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
            pst.close();
            rs.close();
        }

        return list;
    }
}
