package com.my.package3;
/*
静态代码块的格式：
public class 类名称 {
    static {
        //静态代码内容
    }
}
特点当第一次用到本类是，静态代码块执行唯一一次
静态内容总是优先于非静态，所以静态代码块比构造方法先执行

静态代码块的典型用途
用来一次性的对静态变量成员进行赋值
 */
public class Demo147Static {
    public static void main(String[] args) {
        Demo147Person one = new Demo147Person();
        Demo147Person two = new Demo147Person();
    }
}
