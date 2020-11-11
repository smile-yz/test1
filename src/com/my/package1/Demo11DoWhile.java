package com.my.package1;
/*
do-while循环的标准格式：
do {
    循环体
} while (条件判断);
 */

public class Demo11DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ok!!" + i);
        }
        System.out.println("================================================");

        int i = 1;//初始化语句
        do {
            System.out.println("ok!!" + i); //循环体
            i++;//步进语句
        } while (i <= 10);//条件判断
    }
}
