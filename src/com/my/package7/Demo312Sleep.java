package com.my.package7;

public class Demo312Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1;i <= 60;i++) {
            System.out.println(i);
            //使用Thread类的sleep方法让程序睡眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
