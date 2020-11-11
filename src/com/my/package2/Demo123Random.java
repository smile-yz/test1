package com.my.package2;
import java.util.Random;

/*
题目：
根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1，n

思路：
1.定义一个int变量n,随意赋值
2.要使用Random：三个步骤：导包，创建，使用
3.如果写10，那么就是0~9，然而想要1~10，可以发现：整体+1即可
4.打印随机数字
 */
public class Demo123Random {
    public static void main(String[] args) {
        Random r = new Random();
        //方法1：
        for (int i = 0;i < 100;i++) {
            int num = r.nextInt(10);
            System.out.println(num + 1);
        }
        //方法2：
        int n = 10;
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
