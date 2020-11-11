package com.my.package10;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo433Predicate_test {
    public static ArrayList<String> filter (String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            //对得到的布尔值进行判断
            if (b) {
                //两个条件都满足，把信息存储到ArrayList集合中
                list.add(s);
            }

        }

        return list;
    }
    public static void main(String[] args) {
        //定义字符串数组
        //只有女性并且名字为四个字符串才写入数组
        String[] array = new String[] {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        //调用filter方法，传递字符串数组和两个Lambda表达式
        ArrayList<String> list = filter(array,
                (String s) -> {
                    return s.split(",")[1].equals("女");
                },
                (String s) -> {
                    return s.split(",")[0].length() == 4;
                });
        //遍历集合
        for (String s : list) {
            System.out.println(s);
        }

    }
}
