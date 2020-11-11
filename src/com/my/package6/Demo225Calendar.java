package com.my.package6;
import java.util.Calendar;
/*
java.util.Calendar类:日历类
静态方法叫getInstance();该方法返回了Calendar类的子类对象
static Calendar getInstace() 使用默认时区和语言环境获得一个日历
 */
public class Demo225Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
