package com.my.package1;

public class Demo16DeadLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10;i++) {
            System.out.println("hello" + i);
        }
    }
}
