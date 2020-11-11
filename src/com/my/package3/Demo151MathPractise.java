package com.my.package3;
/*
题目：
计算-10.8到5.9之间，绝对值大于6或者绝对值小于2.1的整数有多少

分析：
1.既然已经确定范围，for循环
2.起点位置-10.8应该转换为-10，两种办法
  2.1可使用Math.ceil方法，向上取整
  2.2强制转换int,自动舍弃所有小数位
3.每一个数字都是整数，所以步进表达式应该是num++,每次+1
4.如何拿去绝对值，Math.abs
5.一旦发现一个数字，需要让计数器++进行统计

备注：如果使用Math.ceil方法，-10.8可以变成-10.0.注意double也是可以进行++的

 */
public class Demo151MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min;i < max;i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共个数：" + count);
        System.out.println("======================================");
        //方法二
        count = 0;//归零重新计数
        //使用Math.ceil向上取整-10.8
        for (double i = Math.ceil(min);i < max;i++) {
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共个数：" + count);
    }
}
