package com.my.package6;
import java.util.ArrayList;
import java.util.Iterator;
/*
泛型的通配符；
?: 代表任意的数据类型
使用方法：
不能创建对象使用
只能作为方法的参数使用

泛型的上限限定： ? extends E  代表使用的泛型只能是E类型的子类/本身
泛型的下限限定： ? super E    代表使用的泛型只能是E类型的父类/本身
 */
public class Demo251Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        list02.add("c");

        printArray(list01);
        printArray(list02);

        
    }

    //定义一个方法，能遍历任何类型的ArrayList集合
    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
           Object o =  it.next();
            System.out.println(o);
        }
    }
}
