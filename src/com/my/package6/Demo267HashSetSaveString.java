package com.my.package6;
import java.util.HashSet;
/*
Set集合不允许重复元素的原理
 */
public class Demo267HashSetSaveString {
    public static void main(String[] args) {
      //创建一个set集合HaSet
        HashSet<String> set = new HashSet<>();
        String S1 = new String("abc");
        String S2 = new String("abc");
        set.add(S1);
        set.add(S2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
