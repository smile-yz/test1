package com.my.package2;
/*
直接打印数组名称，得到的是数组对应的，内存地址哈希值。

访问数组元素的格式：数组名称（索引值）
索引值：就是一个int数字，代表数组当中元素的编号
【注意】索引值从0开始，一直到“数组的长度-1”为止
*/
public class Demo82ArrayUse {
    public static void main(String[] args) {
        //静态初始化
        int[] arrayA = new int[] { 10, 20, 30 };
        System.out.println(arrayA); //[I@1b6d3586
        System.out.println(arrayA[0]); //10
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=========================");

        int num = arrayA[1];
        System.out.println(num);
    }
}
