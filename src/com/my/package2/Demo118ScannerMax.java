package com.my.package2;
import java.util.Scanner;
/*
题目：
键盘输入三个int数字，然后求出其中最大值
思路：
1.既然是键盘输入，肯定需要用到Scanner
2.Scanner三个步骤： 导包、创建、使用
3.三个是数字调用三次
 */
public class Demo118ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.print("请输入第三个数字：");
        int c = sc.nextInt();
//方法1：
//        if (a > b && a > c) {
//            System.out.println("最大的值为：" + a);
//        } else if (b > a && b > c) {
//            System.out.println("最大的值为：" + b);
//        } else {
//            System.out.println("最大的值为：" + c);
//        }
//方法2：
        int temp = a > b ? a : b;
        int max = temp > c ? temp  : c;
        System.out.println("最大值：" + max);
    }
}
