package com.my.package6;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
/*
java.util.Iterator接口：迭代器（对集合进行遍历）
两个常用方法：
    bollean hasNext():如果仍有元素可以迭代，则返回true
    E next():返回迭代的下一个元素，取出集合中的下一个元素
获取实现类对象：Collection接口中有一个方法叫iterator(); 这个方法返回的就是迭代器的实现类对象
Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器

迭代器的使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用iterator接口来接收（多态）
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo242Iterator {
    public static void main(String[] args) {
        //创建一个集合对象，多态
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("Tom");
        coll.add("Jerry");
        coll.add("马尔扎哈");
        coll.add("古力娜扎");

        Iterator<String> it = coll.iterator();
        //boolean b1 = it.hasNext();
       // System.out.println(b1);//true
       // String s1 = it.next();
        //System.out.println(s1);//tom
        //String s2 = it.next();
        //System.out.println(s2);//jerry
        System.out.println("============");

        //循环方法一：
//        for (int a = 0;a < coll.size();a++) {
//            if (it.hasNext()) {
//                int i = 1;
//                String xi = it.next();
//                System.out.println(xi);
//                i++;
//            }
//        }
//        boolean bx = it.hasNext();
//        System.out.println(bx);//若是取完元素，便会得到false

        //循环方法二：
//        while (it.hasNext()) {
//            String s = it.next();
//            System.out.println(s);
//        }
        //循环第三种方法：
        for (Iterator<String> it2 = coll.iterator();it2.hasNext();) {
            String s = it2.next();
            System.out.println(s);
        }
    }
}
