package com.my.game;

public class CumulativeSum {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        while (i <= 200) {
           sum += i;
           i++;
        }
        System.out.println("和为：" + sum);
    }
}
class Sum2 {
    public static void main(String[] args) {
        int i = 100,sum2=0;
        do {
            sum2 += i;
            i++;
        }while(i <= 200);
        System.out.println("和为1：" + sum2);
    }
}
class Sum3 {
    public static void main(String[] args) {
        int sum3 =0;
        for (int i = 100;i <= 200;i++) {
            sum3 +=i;
        }
        System.out.println("和为2：" + sum3);
    }
}