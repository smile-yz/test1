package com.my.package10;

import java.util.function.Consumer;

/*
练习：字符串数组当中存在多条信息，请按照格式“姓名：xxx。性别：x。”的格式将信息打印出来
 */
public class Demo429Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"迪丽热巴，女", "古力娜扎，女", "马尔扎哈，男"};
        printInfo(arr,
                (s) -> {
                    String name = s.split("，")[0];
                    System.out.print("姓名：" + name);
                },
                (s) -> {
                    String age = s.split("，")[1];
                    System.out.println("。性别：" + age + "。");
                });

    }
}
