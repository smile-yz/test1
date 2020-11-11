package com.my.package6;
/*
java.lang.StringBuilder类：字符缓冲区，可以提高字符串的效率
构造方法：
    public StringBuilder()：构造一个空的StringBuilder容器
    public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去

StringBuilder类的成员方法：
    pulic StringBuilder append(...):添加任意类型数据的字符串形式，并返回当前对象自身。
    参数：
        可以是任意的数据类型
*/
public class Demo230StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1：" + bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2：" + bu2);

        //创建StringBuilder对象
        StringBuilder bub1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，就是调用方法的对象
//        bub1.append("abc");
//        StringBuilder bub2 = bub1.append("abc");
//        System.out.println(bub1);//abc
//        System.out.println(bub2);//abc
//        System.out.println(bub1 == bub2);//true两个对象是同一个对象

        //使用append方法无需接受返回值
        bub1.append("abc");
        bub1.append(1);
        System.out.println(bub1);//abc1

        /*
        链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
         */
        System.out.println("abc".toUpperCase().toUpperCase().toUpperCase());
        bub1.append("abc3").append(1).append(2).append(true).append(8.8).append('中');//abc1abc312true8.8中
        System.out.println(bub1);

        /*
        public Strin toString():将当前StringBuilder对象转换称为String对象
         */
        String str = "hello";
        System.out.println("str: " + str);
        StringBuilder bu3 = new StringBuilder(str);
        bu3.append("world");
        System.out.println("bu3: " + bu3);
        String str2 = bu3.toString();
        System.out.println("str2: " + str2);
        System.out.println(bu3.reverse());//反转
    }
}