package com.my.package1;

public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int secont = 0; secont < 60; secont++) {
                    System.out.println(hour + "点" + minute + "分" + secont + "秒");
                    System.out.println(hour + "点" + minute + "分" + secont + "秒");
                }
            }
        }
    }
}
