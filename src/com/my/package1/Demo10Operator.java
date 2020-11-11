package com.my.package1;

public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值：" + max);

        int result = 3 < 5 ? (int)2.5 : 10;
        System.out.println(result);

        System.out.println(a < b ? a : b);
    }
}
