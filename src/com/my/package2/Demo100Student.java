package com.my.package2;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用
1.导包：也就是指出需要使用的类，在什么位置
import 包名称.类名称;
import com.my.package2.Demo99Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写

2.创建：
格式：  类名称 对象名 = new 类名称();
Demo99Student stu = new Demo99Student();

3.使用，分为两种情况：
使用成员变量： 对象名.成员变量名
使用成员方法： 对象名.成员方法名(参数)
（想用谁，就用对象名（.）点谁

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则与数组一样
 */
public class Demo100Student {
    public static void main(String[] args) {
        //1.导包
        //需使用Demo99Student类，和目前Demo100Student位于同一个包中，所以省略不写

        //2.创建： 类名称  对象名 = new 类名称();
        Demo99Student stu = new Demo99Student();

        //3.使用
        //对象名.成员变量名
        System.out.println(stu.name); //null
        System.out.println(stu.age); //0
        System.out.println("==========================");
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("======================");

        //4.使用对象的成员方法
        //对象名.成员方法();
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
