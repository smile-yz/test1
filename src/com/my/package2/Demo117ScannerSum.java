package com.my.package2;
import java.util.Scanner;
/*
题目：键盘输入两个int数字，并且求出和值
思路：
1.既然需要键盘输入那么就用scanner
2.scanner三个步骤：导包、创建、使用
3.需两个数字，需掉调用两次nextInt方法
4.求和
5.打印输出
 */
public class Demo117ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第一个数字：");
        int a = sc.nextInt();

        System.out.print("请输入第二个数字：");
        int b = sc.nextInt();


        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
