package com.my.test;

import com.my.package10.Demo460Calculator;
//import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Demo460CalculatorTest {

    /**
     * 初始化方法
     * 用于资源的申请，所有测试方法再执行之前都会执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源的方法
     * 在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close....");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd() {
        //System.out.println("hello");
        //1.创建计算器对象
        Demo460Calculator c = new Demo460Calculator();
        //2.调用add方法
        int result = c.add(1,2);
        System.out.println("testAdd...");
//        System.out.println(result);
        //3.断言  我断言这个结果是3
        //assert result == 3;
        Assert.assertEquals(3,result);
        //Assertions.assertEquals(3,result);
    }

    @Test
    public void testSub() {
        Demo460Calculator c = new Demo460Calculator();
        int result = c.sub(1,2);
        System.out.println("testSub....");
        Assert.assertEquals(-1,result);
        //Assertions.assertEquals(-1,result);
    }
}
