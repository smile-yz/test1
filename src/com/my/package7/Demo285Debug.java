package com.my.package7;
/*
Debug调试程序：可以让代码逐行执行，查看代码执行过程，调试程序过程中出现的bug
使用方法：
此行开端位置添加断点（小红点），每个方法的第一行，哪里有bug添加到哪里
右键选择Debug执行程序
程序会停留在添加的第一个断点处

执行程序：
  f8   逐行执行程序
  f7   进入到方法中
  shift+f8   跳出方法
  f9   跳到下一个断点，如果没有下一个断点，那么就结束程序
  ctrl+f2  退出Debug模式，停止程序
  Console   切换到控制台
 */
public class Demo285Debug {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);

        /*for (int i = 0;i < 3;i++) {
            System.out.println(i);
        }*/
        print();



    }
    private static void print() {
        System.out.println("Hello  Wolld!!");
        System.out.println("Hello  Wolld!!");
        System.out.println("Hello  Wolld!!");
        System.out.println("Hello  Wolld!!");
        System.out.println("Hello  Wolld!!");
        System.out.println("Hello  Wolld!!");
    }
}
