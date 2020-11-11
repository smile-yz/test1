package com.my.package3;
import java.util.Arrays;
/*
题目：
请使用Arrays相关的API将一个随机字符串中的所有字符升序排序，并倒序打印
 */
public class Demo149ArraysPractise {
    public static void main(String[] args) {
        String str = "laksgoawihgssmbzxucga";
        //如何进行升序：sort
        //必须是个数组才能用Arrays.sort方法
        //String -- >数组 ： toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
       //倒序打印
        for (int i = chars.length - 1; i >= 0;i--) {
            System.out.print(chars[i]);
        }
    }
}
