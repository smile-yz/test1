package com.my.package6;
import java.util.HashSet;
import java.util.LinkedHashSet;
/*
java.util.LinkedHashSet集合 extends HashSet集合
特点: 底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo269LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itit");
        System.out.println(set);//[abc, www, itit]  无序的并且不可重复

        LinkedHashSet<String> linked = new  LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itit");
        System.out.println(linked);//[www, abc, itit]  有序并且不可重复
    }
}
