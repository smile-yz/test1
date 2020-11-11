package com.my.package2;
/*
定义格式：
 */
public class Demo01Method {
    public static void main(String[] args) {
    System.out.println(sum(3));
    int num1 = sum(3);
    System.out.println(num1);
    printMethod();
    int a = 2;
    double b = 3.4;

    System.out.println(a + b);
    }
    //打印矩形*
    public static void printMethod() {
        for (int j = 0; j < 5;j++) {
            for (int i = 0;i < 20;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //1-100的叠加，递归调用
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        int result = num + sum(num - 1);
        return result;
    }
}
