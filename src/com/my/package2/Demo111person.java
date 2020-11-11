package com.my.package2;
/*
方法的局部变量和类的成员变量重名的时候，根据将近原则，优先使用局部变量
需要访问本类当中的成员变量，需使用格式：
this.成员变量名

通过谁调用的方法，谁就是this
 */
public class Demo111person {
    String name;
    public void sayHello(String name) {
        System.out.println(name + "，你好!我是" + this.name);
        System.out.println(this);
    }
}
