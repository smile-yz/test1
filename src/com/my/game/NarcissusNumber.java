package com.my.game;

import java.util.Scanner;

public class NarcissusNumber {
    public static void main(String[] args) {
        num(100,999);
        //num1();
        //num2();
    }
    //100-1000的水仙花数
        public static void  num(int inum,int onum) {
            System.out.println("水仙花数为：");
            for (int i = inum; i <= onum; i++) {
                //math.pow(x,2)  平方，math.pow(x,3) 立方
                //(Math.pow(i / 100, 3)         取出百位数，求立方
                //Math.pow((i / 10) % 10, 3)    取出十位数，求立方
                //Math.pow(i % 10, 3)           取出个位数，求立方
                if (Math.pow(i / 100, 3) + Math.pow((i / 10) % 10, 3) + Math.pow(i % 10, 3) == i) {
                    System.out.println(i);
                }
            }
        }
        public static void num1() {
            int  a = 0;
            for (int i = 100; i <= 1000;i++) {
                if (Math.pow(i / 100, 3) + Math.pow((i / 10) % 10, 3) + Math.pow(i % 10, 3) == i) {
                 a += i;
                }
            }
            System.out.println("水仙花数之和为：" + a);
        }
        //判断某个数能否被3，5，7整除
        public static void num2() {
            Scanner scan = new Scanner(System.in);
            System.out.print("请输入num值：");
            int num = scan.nextInt();
            int i = num % 3;
            int j = num % 5;
            int k = num % 7;
            if (i==0&&j==0&&k==0) {
                System.out.println(num + "\t" + "能被3,5,7同时整除");
            }else{
                System.out.println(num + "\t" + "不能被3,5,7同时整除");
            }
            scan.close();
        }
}
