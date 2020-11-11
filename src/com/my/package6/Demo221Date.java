package com.my.package6;
import java.util.Date;
public class Demo221Date {
    public static void main(String[] args) {
        Demo01();
        System.out.println("=====================");
        Demo02();
        Demo03();

    }
    /*
    Date类的空参数构造方法
    Date()获取的就是当前系统的日期和时间
     */
    private static void Demo01() {
        Date date = new Date();
        System.out.println(date);//Thu Mar 05 21:58:15 CST 2020
    }

    /*
    Date类的带参数构造方法：
    Date(long date) :传递毫秒值，把毫秒转换为Date日期
     */
    private static void Demo02() {
        Date D1 = new Date(0L);
        System.out.println(D1);//Thu Jan 01 08:00:00 CST 1970
        System.out.println("================================");
        Date D2 = new Date(11111111111L);
        System.out.println(D2);//Sat May 09 22:25:11 CST 1970
    }

    /*
    Date类的成员方法：
    long getTime() 把日期转换为毫秒（相当于System.currentTimeMillis()）
    返回自1970年1月1日00：00：00GMT以来此Date对象表示的毫秒数
     */
    private static void Demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        System.out.println("==========================");
        System.out.println(System.currentTimeMillis());
    }
}
