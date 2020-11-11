package com.my.package6;
/*
object类的equals方法默认比较的是两个对象的地址值，没有意义
所以我们需要重写equals方法，比较两个对象的属性值（name,age）
对象的属性值一样，返回true，否则返回false

问题：
隐含一个多态
Object obj = p2;
Object obj = new Demo215Person("古力娜扎",18);
多态弊端：无法使用子类特有的内容（属性，方法）
解决：可以使用向下转型（强转）
 */
public class Demo215Equals {
    public static void main(String[] args) {
        /*
        Demo215Person类继承了Object类，所以可以使用Object类的equals方法
        boolean equals(Object boj) 指示其他某个对象是否与此对象“相等”
         */
        Demo215Person p1 = new Demo215Person("迪丽热巴",19);
        Demo215Person p2 = new Demo215Person("古力娜扎",18);
        Demo215Person p3 = new Demo215Person("迪丽热巴",19);

        System.out.println(p1);
        System.out.println(p2);
        boolean a = p1.equals(p3);
        System.out.println(a);//false
        a = p1.equals(p1);
        System.out.println(a);
        a = p1.equals(null);
        System.out.println(a);

        System.out.println("================");

       /* p1 = p2;

        System.out.println("=====================");

        System.out.println(p1);
        System.out.println(p2);
        boolean b = p1.equals(p2);
        System.out.println(b);//true*/


    }
}
