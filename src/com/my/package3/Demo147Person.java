package com.my.package3;
/*
静态代码块的格式：
public class 类名称 {
    static {
        //静态代码内容
    }
}
特点当第一次用到本类是，静态代码块执行唯一一次
 */
public class Demo147Person {
    static {
        System.out.println("静态代码块执行！");
    }
    public Demo147Person() {
        System.out.println("构造方法执行！");
    }
}
