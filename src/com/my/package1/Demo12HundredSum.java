package com.my.package1;


public class Demo12HundredSum {
    public static void main(String[] args) {
       int sum = 0;
        for (int i = 1; i <= 100; i++) {
           if (i % 2 == 0) {
               sum += i;
           }
       }
        System.out.println("结果是1：" + sum);
        System.out.println("======================");

        int ii = 1;
        sum = 0;
        while (ii <= 100) {
            if (ii % 2 == 0) {
                sum += ii;
            }
            ii++;
        }
        System.out.println("结果是2：" + sum);
        System.out.println("======================");

        int iii = 1;
        int sum2 = 0;
        do {
            if (iii % 2 == 0) {
                sum2 += iii;
            }
            iii++;
        } while (iii <= 100);
        System.out.println("结果是3：" + sum2);
    }
}
