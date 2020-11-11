package com.my.package2;

public class Demo85ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3]; //动态初始化
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("================");

        //改变数组当中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
