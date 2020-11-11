package com.my.package2;
/*
面向过程：当需要实现一个功能的时候，每一个步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体步骤，而是找一个已经具有该功能的人，来帮我做事
 */

import java.util.Arrays;

public class Demo96PrintArray {
    public static void main(String[] args) {
        int[] arrayA = new int[] { 10, 20, 30, 40, 50, 60 };
        //要求打印格式为：[10, 20, 30, 40, 50]
        //使用面向过程：每一个步骤都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if (i == arrayA.length - 1) {
                System.out.println(arrayA[i] + "]");
            } else {
                System.out.print(arrayA[i] + ", ");
            }
        }
        System.out.println("=======================");

        //使用面向对象
        //jdk提供好的Arrays类
        //其中一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(arrayA));
    }
}
