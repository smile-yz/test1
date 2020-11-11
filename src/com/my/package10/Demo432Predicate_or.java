package com.my.package10;

import java.util.function.Predicate;

public class Demo432Predicate_or {
    public static boolean checkPredicate(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //or写法一：
        //return pre1.test(s) || pre2.test(s);
        //or写法二：
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abc";
        boolean b = checkPredicate(s,
                (String str)->{
                    return str.length() > 5;
                },
                (String str)->{
                    return str.contains("a");
                });
        System.out.println(b);
    }
}
