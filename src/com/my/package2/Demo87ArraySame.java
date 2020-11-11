package com.my.package2;

public class Demo87ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3]; //动态初始化
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("================");

        //改变数组当中元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("================");

        int[] arrayB = arrayA; //动态初始化
        System.out.println(arrayB);
        System.out.println(arrayB[0]); //0
        System.out.println(arrayB[1]); //10
        System.out.println(arrayB[2]); //20
        System.out.println("================");

        //改变数组当中元素的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);
        System.out.println(arrayB[0]); //0
        System.out.println(arrayB[1]); //100
        System.out.println(arrayB[2]); //200
        System.out.println("================");
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }
}
