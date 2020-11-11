package com.my.package1;

public class Demo04IfElseExt {
    public static void main(String[] args) {
        int x = 2;
        int y;
        if (x >= 3) {
            y = x * 2 + 1;
        } else if (-1 < x && x < 3) {
            y = x * 2;
        } else {
            y = x * 2 - 1;
        }
        System.out.println("结果是：" + y);
    }
}
