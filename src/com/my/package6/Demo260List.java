package com.my.package6;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
java.util.list接口 extends Collection接口
List接口的特点：
 1.有序的集合，存储元素和取出元素的顺序是一致的
 2.有索引，包含了一些索引的方法
 3.允许存储重复的元素
 List接口中带索引的方法（特有）：
    public void add(int index,E element):将指定的元素，添加到该集合中的指定位置上
    public E get(int index):返回集合中指定位置的元素
    public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
    public E set (int index,E element):用指定的元素替换集合中指定位置的元素，返回值是更新前的元素
 */
public class Demo260List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);

        //    public void add(int index,E element):将指定的元素，添加到该集合中的指定位置上
        //c和d 之间添加嘿嘿嘿
        list.add(3,"嘿嘿嘿");
        System.out.println(list);

        //    public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        list.remove(5);
        System.out.println(list);

        //    public E set (int index,E element):用指定的元素替换集合中指定位置的元素，返回值是更新前的元素
        //把d替换为D
        list.set(4,"D");
        System.out.println(list);

        //public E get(int index):返回集合中指定位置的元素
        //list遍历
        //第一种方法
        for (int i = 0;i < list.size();i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("=====================");
        //第二种方法
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("====================");
        //第三种方法
        for (String s:list) {
            System.out.println(s);
        }



    }
}
