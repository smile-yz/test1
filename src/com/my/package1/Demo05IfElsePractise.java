package com.my.package1;

public class Demo05IfElsePractise {
    public static void main(String[] args) {
        int scorce = 101;
        if (0 > scorce || scorce > 100) {
            System.out.println("你的成绩是错误的！！");
        } else if (90 <= scorce && scorce <= 100) {
            System.out.println("你的成绩：" + scorce + "   属于优秀！");
        } else if (80 <= scorce && scorce < 90) {
            System.out.println("你的成绩：" + scorce + "   属于好！");
        } else if (70 <= scorce && scorce < 80) {
            System.out.println("你的成绩：" + scorce + "   属于良！");
        } else if (60 <= scorce && scorce < 70) {
            System.out.println("你的成绩：" + scorce + "   属于及格！");
        } else {
            System.out.println("你的成绩：" + scorce + "   属于不及格！");
        }
    }
}
