package com.my.package6;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo247 {
    public static void main(String[] args) {
        show01();
    }
    /*
    创建集合对象，不适用泛型
    好处：集合不适用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    弊端：不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(111);
        //迭代器遍历集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法hasNext  next遍历集合
        while(it.hasNext()) {
            //取出元素
            Object obj = it.next();
            System.out.println(obj);

            String s = (String) obj;
            System.out.println(s.length());
        }
    }
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        //list.add(123);
    }
}
