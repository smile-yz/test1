package com.my.package10;
import java.util.function.Function;

/*
练习自定义函数模型拼接
使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
String str = "赵丽颖,20";
分析：
1.将字符串截取数字年龄部分，得到字符串；
    Function<String,String> "赵丽颖,20" -> "20"
2.将上一步的字符串转换为int类型的数字
    Funciton<String,Integer> "20" -> 20
3.将上一步int数字累加100，得到结果int数字
    Function<Integer,Integer> 20 -> 120
 */
public class Demo436Function {
    public static int change(String s,Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3) {
        //使用andThen方法，把三个转换组合一起
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
    public static void main(String[] args) {
        String s = "赵丽颖,20";
        int num = change(s,
                (String str) -> {
                    return str.split(",")[1];
                },
                (String str) -> {
                    return Integer.parseInt(str);
                },
                (Integer i) -> {
                    return i + 100;
                });
        System.out.println(num);
    }
}
