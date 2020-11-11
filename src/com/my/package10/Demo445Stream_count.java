package com.my.package10;
import java.util.stream.Stream;
import java.util.ArrayList;
/*
Stream流中的常用方法 count:用于统计Stream流中元素的个数
long count();
count方法是一个终结方法，返回值是一个long类型的整数
所以不能再继续调用Stream流中的其他方法
 */
public class Demo445Stream_count {
    public static void main(String[] args) {
        //获取一个Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//10

    }
}
