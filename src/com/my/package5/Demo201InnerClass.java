package com.my.package5;
/*
如果一个事务的内部包含另一个事务，那么这就是一个类的内部包含另一个类
分类：
1.成员内部类
2.局部内部类（包含匿名内部类）
成员内部类的定义格式：
修饰符 class 外部类名称 {
    修饰符 class 内部类名称 {
        //。。。
    }
    //。。。
}
注意：内部类使用外部类，可以随意访问， 外用内，需要借助内部类对象。
===============
如何使用成员内部类，有两种方式：
1.间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
2.直接方法，公式:
外部类名称.内部类名称  对象名 = new 外部类名称().new 内部类名称();
 */
public class Demo201InnerClass {
    public static void main(String[] args) {
        Demo201Body body = new Demo201Body();
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部类Heart
        body.methodBody();
        System.out.println("============================");
        Demo201Body.Heart heart = new Demo201Body().new Heart();
        Demo201Body.Heart heart1 = new Demo201Body().new Heart();
        Demo201Body.Heart haert2 = new Demo201Body().new Heart();
        heart.beat("haha");
    }
}
