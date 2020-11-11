package com.my.package2;

import java.util.Random;

/*
Random类用来生成随机数，使用起来需三个步骤：
1.导包
import java.util.Random;
2.创建
Random r = new Random();
3.使用
随机一个int数字(范围是int所有范围，有正负两种)：int num = r.nextInt();
随机一个int数字(参数代表范围，左闭右开区间)：int num = r.nextInt(3);
实际上代表的含义是：[0,3),也就是0~2
 */
public class Demo121Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是： " + num);
    }
}
