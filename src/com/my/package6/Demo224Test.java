package com.my.package6;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/*
练习：
计算出生了多少天
分析：
1.使用Scanner类中的next,获取出生日期
2.使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
3.把Date格式的出生日期转换为毫秒值
4.把当前日期转换为毫秒值
5.使用当前日期的毫秒值减去出生日期的毫秒值
6.把毫秒值转换为天
 */
public class Demo224Test {
    public static void main(String[] argss) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的出生日期，格式yyyy-MM-dd：");
        //获取键盘输入字符串
        String birthdayDateString = sc.next();
        //按照指定的模式，将获取的字符串转换为date日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //
        long birthdayDateTime = birthdayDate.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        Date day = new Date(time);
        System.out.println(day);
        System.out.println("===============");
        System.out.println(time/1000/60/60/24);
    }
}
