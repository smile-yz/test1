package com.my.package10;

import java.util.function.Predicate;

public class Demo431Predicate_and {
    /*
    传递两个Predicate接口，一个判断长度是否大于5，一个判断是否包含a
     */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //方法一：
        //return pre1.test(s) && pre2.test(s);
        //方法二：
        return pre1.and(pre2).test(s);
    }


    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s,
                (String str) -> {
                     return str.length() > 5;
                },
                (String str) -> {
                    return str.contains("a");
                });
        System.out.println(b);
    }
}
