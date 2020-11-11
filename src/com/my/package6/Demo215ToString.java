package com.my.package6;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/*
java.lang.object类
类object是类层次结构的跟（最顶层）类，每个类都是用object作为超（父）类
所有对象（包括数组）都实现这个类的方法。
 */
public class Demo215ToString {
    public static void main(String[] args) {

        /*
        Demo215Person默认继承了object类，所以可以使用object类中的toString方法
        String toString() 返回该对象的字符串表示
         */
        Demo215Person p = new Demo215Person("马尔扎哈",18);
        String s = p.toString();
        System.out.println(s);//com.my.package6.Demo215Person@10f87f48

        //直接打印对象的名字，其实就是调用对象的toString方法  p = p.toString();
        System.out.println(p);//com.my.package6.Demo215Person@10f87f48,重写toString方法之后 Demo215Person{name='马尔扎哈',age=18}

        /*
        看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
        如果没有重写toString方法，那么打印的就是对象的地址值（默认），
        如果重写了toString方法，那么就按照重写的方式打印
         */
        Random r = new Random();
        System.out.println(r);//java.util.Random@b1bc7ed

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=....

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2]
    }
}
