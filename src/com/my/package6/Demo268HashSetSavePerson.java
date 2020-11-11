package com.my.package6;
import java.util.HashSet;
/*
HashSet存储自定义类型元素
 */
public class Demo268HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Demo268Person> set = new HashSet<>();
        Demo268Person p1 = new Demo268Person("迪丽热巴", 18);
        Demo268Person p4 = new Demo268Person("迪丽热巴", 18);
        Demo268Person p2 = new Demo268Person("古力娜扎", 19);
        Demo268Person p3 = new Demo268Person("马尔扎哈", 33);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
