package com.my.package6;
/*
java.util.date:表示日期和时间的类
Date：表示特定的瞬间，精确到毫秒
毫秒：千分之一秒，1000毫秒=1秒
特定的瞬间：一个时间点，一刹那时间

毫秒值的作用：可以对时间和日期进行计算
2099-01-03到2088-01-01中间有多少天
可以把日期转换为毫秒进行计算，计算完毕，再把毫秒转换为日期

把日期转换为毫秒：
        当前日期：2088-01-01
        时间原点（0毫秒）：1970-01-01 00:00:00
        就是计算当前日期到时间原点之间一共经历了多少毫秒

把毫秒转换为日期
1天=24X60X60=86400秒=86400X1000=86400000毫秒
 */
public class Demo220Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间一共到1970年1月1日 00:00:00经历了多少毫秒
        long a = System.currentTimeMillis()/1000/86400;
        System.out.println(a);
    }
}
