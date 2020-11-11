package com.my.package10;

import java.util.function.Predicate;

/*
java.util.function.Predicate<T>接口
作用：某种数据类型的数据进行判断，结果返回一个boolean值
抽象方法：
boolean test(T t)用来对指定数据类型进行判断的方法

 */
public class Demo430Predicate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
    public static void main(String[] args) {
        String s = "abcd";
        boolean b = checkString(s,(String str) -> {
            return str.length() > 5;
        });
        System.out.println(b);

        boolean c = checkString(s,str -> str.length() > 5);
        System.out.println(c);

    }
}
