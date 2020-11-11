package com.my.package8;
/*
练习使用递归计算1-n之间的和
 */
public class Demo352Recurison {
    int b = 0;
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
        a(3);
    }
    /*
    已知最大值n,最小值1.
    n+(n-1)+(n-2)+...+1
     */
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);


    }
    public static void a(int b){
        int c = 0;
        for(int d = b;d > 0; d--) {
           c += d;

        }
        System.out.println(c);
    }

}
