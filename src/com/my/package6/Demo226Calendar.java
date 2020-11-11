package com.my.package6;
import java.util.Calendar;
import java.util.Date;
/*
Calendar类的成员方法：
  public int get(int field):返回给定日历字段的值
  public void set(int field,int value):将给定的日历字段设置为给定的值
  public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
  public Date getTime():返回一个表示次Calendar时间值（从历元到现在的毫秒偏移量）的Date对象

  成员方法的参数：
        int field:日历类的字段，可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1; 年
        public static final int MONTH = 2;月
        public static final int DATE = 5;月中的某一个天
        public static final int DAY_OF_MONTH = 5;月中的某一天
        public static final int HOUR = 10; 时
        public static final int MINUTE = 12;分
        public static final int SECOND = 13;秒

 */
public class Demo226Calendar {
    public static void main(String[] args) {
        Demo01();
        Demo02();
        Demo03();
        Demo04();
    }
    /*
    public int get(int field):返回给定日历字段的值
    参数：传递指定的日历字段
    返回值：日历字段代表具体的值
     */
    private static void Demo01() {
        //获取日历对象使用getInstance获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
        System.out.println("=================================");
    }

    /*
    public void set (int field,int value):给定的日历字段设置为给定值
    参数:
        int field:传递指定的日历字段（YEAE,MONTH）
        int value:传递的字段设置的具体的值
     */
    private static void Demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2021);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        c.set(Calendar.MONTH,4);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        c.set(Calendar.DATE,7);
        int date = c.get(Calendar.DATE);
        System.out.println(date);

        c.set(2022,2,2);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1 + "." + month1 + "." + date1);
    }

    /*
      public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
      把指定的字段增加/减少指定的值
      参数：
        int field:传递指定的日历字段（YEAE,MONTH）
        int amount:增加/减少的值
     */
    private static void Demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,1);
        c.add(Calendar.DATE,1);


        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
    public Date getTime():返回一个表示次Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
    日历对象->日期对象
     */
    private static void Demo04() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }
}
