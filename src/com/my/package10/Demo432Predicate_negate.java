package com.my.package10;

import java.util.function.Predicate;

public class Demo432Predicate_negate {
    public static boolean checkPredicate(String s, Predicate<String> pre) {
        //以下两种方法结果相同
        //return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkPredicate(s,(String str) -> {
            return str.length() > 5;
        });
        System.out.println(b);//大于五，取反
    }
}
