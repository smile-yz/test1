package com.my.package6;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
/*
java.util.Set接口 extends Collection接口
Set接口特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for遍历

  java.util.HashSet集合 implements Set接口
  特点:
    1.不允许存储重复元素
    2.没有索引，没有带索引的方法，也不能使用普通的for遍历
    3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    4.底层是一个哈希表结构（查询的速度非常的快）
 */
public class Demo264Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
