package com.my.package1;
/*
三种循环区别：
1.如果条件判断从来没满足过，那么for循环和whlie循环将会执行0次，但是do-while循环会执行至少一次
 */
public class Demo13LoopDifference {
    public static void main(String[] args) {
        for (int i = 1; i < 0; i++) {
            System.out.println("Hello!");
        }
        System.out.println("==============================");

        int i = 1;
        while (i < 0) {
            System.out.println("Hello!");
            i++;
        }
        System.out.println("==============================");


        do {
            System.out.println("Hello!");
            i++;
        } while (i < 0);
    }
}
