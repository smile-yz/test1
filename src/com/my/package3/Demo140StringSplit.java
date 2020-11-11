package com.my.package3;
/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成为若干比分
 */
public class Demo140StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==================");

        String str2 = "aaa bbb ccc a b c";
        String[] array2 =  str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==================");

    }
}
