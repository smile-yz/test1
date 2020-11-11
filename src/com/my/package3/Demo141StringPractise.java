package com.my.package3;
/*
题目：
定义一个方法，把数组（1，2，3）按照指定格式拼接成一个字符串，格式参照如下：[word1#word2#word3#]
分析：
1.首先准备一个int[]数组，内容是：1、2、3
2.定义一个方法，用来将数组变成字符串
三要素：
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3.格式：[word1#word2#word3#]
用到：for循环、字符串拼接、每个数组元素之前都有word字样，使用#分隔，区分是不是最有一个
4.调用方法，得到返回值，并且打印结果字符串
 */
public class Demo141StringPractise {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3};
        String result = fromArrayToString(array1);
        System.out.println(result);
    }
    public static String fromArrayToString(int[] array1) {
        String str = "[";
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length -1) {
                str += "world" + array1[i] + "]";
            } else {
                str += "world" + array1[i] + "#";
            }
            System.out.println(str);
        }
        return str;
    }
}
