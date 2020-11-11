package com.my.package4;
/*
final关键字代表最终、不可改变的。
常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.还可以用来修饰一个局部变量
4.还可以用来修饰一个成员变量

1.当final关键字用来修饰一个类的时候，格式:
public final class 类名称 {
    //。。。
}
含义：当前这个类不能有任何的子类。

2.当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
格式：
修饰符 final 返回值类型 方法名称(参数列表) {
    //方法体
}
注意事项：对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾

3.对于基本类型来说，不可变说的是变量当中的数据不可改变
  对于引用类型来说，不可变说的是变量当中的地址值不可该改变,但数据内容可改变

4.对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变
    ①.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了。
    ②.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。
    ③.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。

 */
public class Demo195Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        //一次赋值，终生不变
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 300;//错误写法！不能改变！
        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可该改变
        Demo198Student stu1 = new Demo198Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName()); //赵丽颖
        stu1 = new Demo198Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());//霍建华
        System.out.println("=======================");
        final Demo198Student stu2 = new Demo198Student("高圆圆");
        System.out.println(stu2.getName());
        //错误写法！final的引用类型变量，其中的地址不可改变
//        stu2 = new Demo198Student("赵又廷");
        stu2.setName("哇哈哈");
        System.out.println(stu2.getName());
    }
}
