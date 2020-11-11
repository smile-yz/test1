package com.my.package8;
/*
递归计算阶乘
n的阶乘：n!=n*(n-1)*...*3*2*1
 */
public class Demo353Recurison {
    public static void main(String[] args) {
        int c = sum(5);
        System.out.println(c);
    }
    public static int sum(int a) {
        if(a == 1) {
            return 1;
        }
        return a * sum(a-1);
    }
}
