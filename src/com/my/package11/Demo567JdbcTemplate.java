package com.my.package11;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
 练习：
		* 需求：
			1. 修改1号数据的 salary 为 10000
			2. 添加一条记录
			3. 删除刚才添加的记录
			4. 查询id为1的记录，将其封装为Map集合
			5. 查询所有记录，将其封装为List
			6. 查询所有记录，将其封装为Emp对象的List集合
			7. 查询总记录数
 */
public class Demo567JdbcTemplate {
    //Junit单元测试，可以让方法独立执行

    //1.获取JDBCTemplate对象
    JdbcTemplate template = new JdbcTemplate(Demo563JDBCUtils.getDataSource());

    /*
    1.修改1号的数据salary为10000
     */
    @Test
    public void test1() {
        //2.定义sql
        String sql = "update emp set salary = 10000 where id = ?";
        //3.执行sql
        int count = template.update(sql,1001);
        System.out.println(count);
    }
    //2. 添加一条记录
    @Test
    public void test2() {
        //2.定义sql
        String sql = "insert into emp(id,ename,dept_id) value(?,?,?)";
        //3.执行sql语句
        int count = template.update(sql,1015,"郭靖",10);
        System.out.println(count);
    }
    //3. 删除刚才添加的记录
    @Test
    public void test3() {
        String sql = "delete from emp where id = ?";
        int count = template.update(sql,1015);
        System.out.println(count);
    }
    //4. 查询id为1的记录，将其封装为Map集合
    @Test
    public void test4() {
        String sql = "select * from emp where id = ?";
        Map<String,Object> map = template.queryForMap(sql,1001);
        System.out.println(map);
    }
    //5. 查询所有记录，将其封装为List
    @Test
    public void test5() {
        String sql = "select * from ?";
        List<Map<String,Object>> list = template.queryForList(sql,"emp");
        System.out.println(list); //能够保存多行数据，由索引调用
    }
    //6. 查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void tet6() {
        String sql = "select * from emp";
        List<Demo551Emp> list = template.query(sql,new RowMapper<Demo551Emp>() {
            @Override
            public Demo551Emp mapRow(ResultSet rs, int i) throws SQLException {
                Demo551Emp emp = new Demo551Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                return new Demo551Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
            }
        });
        for(Demo551Emp emp : list) {
            System.out.println(emp);
        }
    }
    @Test
    public void test6_2() {
        String sql = "select * from emp";
        List<Demo551Emp> list = template.query(sql,new BeanPropertyRowMapper<Demo551Emp>(Demo551Emp.class));
        for(Demo551Emp emp : list) {
            System.out.println(emp);
        }
    }
    //7. 查询总记录数
    @Test
    public void test7() {
        String sql = "select count(id) from emp;";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
    
}
