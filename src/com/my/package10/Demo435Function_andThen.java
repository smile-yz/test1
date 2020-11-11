package com.my.package10;
import java.util.function.Function;
/*
Function接口中的默认方法andThen：用来进行组合操作
String的“123”,转换为Integer类型，把转换后的结果加10
把增加之后的Integer类型的数据，转换为String类型

 */
public class Demo435Function_andThen {
    public static void change(String s,Function<String,Integer> fun1,Function<Integer,String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,
                (String str) -> {
                    //把字符串转换为整数,结果增加10
                    return Integer.parseInt(str) + 10;
                },
                (Integer i) -> {
                    //把整数转换为字符串
                    return i + "";
                });
        //优化Lambda表达式
        change(s, str ->  Integer.parseInt(str), i ->  i + "");
    }
}
