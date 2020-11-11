package com.my.package11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
定义一个方法，查询emp表的数据将其封装为对象，然后装在集合，返回。
 */
public class Demo551JDBC {
    public static void main(String[] args) {
        List<Demo551Emp> list = new Demo551JDBC().findAll();
        System.out.println(list);
        for(Demo551Emp s : list) {
            System.out.println(s);
        }
        System.out.println(list.size());
    }

    /**
     *查询所有emp对象
     * @return
     */
    public List<Demo551Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Demo551Emp> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&&useSSL=false","root","123456");
            //3.定义sql
            String sql = "select * from emp";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集
            Demo551Emp emp = null;
            list = new ArrayList<>();
            while(rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                //创建emp对象,并复制
//                emp = new Demo551Emp();
//                emp.setId(id);
//                emp.setEname(ename);
//                emp.setJob_id(job_id);
//                emp.setMgr(mgr);
//                emp.setJoindate(joindate);
//                emp.setSalary(salary);
//                emp.setBonus(bonus);
//                emp.setDept_id(dept_id);
                emp = new Demo551Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);

                //装载集合
                list.add(emp);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return list;
    }

}
