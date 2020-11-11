package com.my.package2;
/*
遍历数组：就是对数组当中的每一个元素进行注意、挨个处理。默认的处理方式就是打印输出。
 */
public class Demo91Array {
    public static void main(String[] args) {
        int[] array = new int[] { 15, 25, 30, 40, 50, 60, 75 };

        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println("============================");

        //使用循环，次数就是数组长度
        for (int i = 0;i < array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println("============================");
        //快捷写法（数组名称.fori)
        //array.fori
    }
}

