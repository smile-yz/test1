package com.my.package2;
/*
一个标准的类通常拥有下面四个组成部分：
1.所有的成员变量都要使用private关键字修饰
2.为每一个成员变量编写一对getter/setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

标准的类也叫做Java Bean
 */
public class Demo113 {
    private String name;
    private int age;

    public Demo113() {

    }
    public Demo113(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
