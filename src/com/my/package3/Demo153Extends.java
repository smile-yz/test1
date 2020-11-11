package com.my.package3;
/*
定义父类的格式：（一个普通的类定义）
public class 父类名称 {
    //...
}

定义子类的格式：
public class 子类名称 extends 父类名称 {
    //...
}
 */
public class Demo153Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Demo153Teacher teacher = new Demo153Teacher();
        //teacher类当中虽然没有写内容，但是会继承来自父类的method方法
        teacher.method();

        //创建一个子类助教的对象
        Demo153Assistant assistant = new Demo153Assistant();
        assistant.method();

    }
}
