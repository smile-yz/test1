package com.my.package6;
/*
1.Object类介绍
object是所有类的父类，一个类都会直接或者间接的继承自该类
2.toString()方法
  A:作用-打印对象信息
  B:重写前打印包名类名@地址值
  C:重现后打印对象中的属性值
3.equals()方法
  A:作用比较两个对象
  B:重写前比较对象的地址值
  C:重写后比较对象中的属性值
4.Objece.equals()方法
  比较两个对象是否相同，但是添加了以下关键性判断，解决了空指针异常

 */
public class Demo219ObjectNote {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);//abc
        System.out.println(str.toString());//abc

        Demo219Student stu = new Demo219Student("张三",18);
//        System.out.println(stu);//com.my.package6.Demo219Student@10f87f48
//        System.out.println(stu.toString());//com.my.package6.Demo219Student@10f87f48
        //重写toString()后，默认会调用此方法
        System.out.println(stu);
    }
}
