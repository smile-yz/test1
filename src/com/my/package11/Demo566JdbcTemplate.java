package com.my.package11;

import org.springframework.jdbc.core.JdbcTemplate;

/*
JdbcTemplate入门
 */
public class Demo566JdbcTemplate {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(Demo563JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 1000 where id = ?";
        int count = template.update(sql,6);
        System.out.println(count);

    }
}
