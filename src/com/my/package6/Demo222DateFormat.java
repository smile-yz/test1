package com.my.package6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/*
java.text.DateFormat:是日期/时间格式化的抽象类
作用:格式化（日期->文本） 解析（文本->日期）
成员方法：
String format(Date date)：按照指定的模式，把Date日期，格式化为符合模式的字符串
Date parse(String source)：把符合模式的字符串，解析为Date日期

DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
java.text.SimpleDateFormat extends DateFormat
构造方法：
SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造 SimplDateFormat
参数：String pattern 传输指定的模式
模式：区分大小写
y 年
M 月
d 日
H 时
m 分
s 秒
'yyyy-MM-dd HH:mm:ss'
 */
public class Demo222DateFormat {
    public static void main  (String[] args) throws ParseException{
        Demo01();
        Demo02();
    }
    /*
    使用DateFormat类中的方法format,把日期格式化为文本
    String format(Date date)：按照指定的模式，把Date日期，格式化为符合模式的字符串
    使用步骤
    1.创建对象SimplDateFormat对象，构造方法中传递指定的模式
    2.调用SimplDateFormat对象中的方法format,按照构造方法中指定的模式把Date日期格式化为符合模式的字符串文本

     */
    private static void  Demo01() {
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(sdf.format(date));
        System.out.println(text);
    }

    /*
        使用DateFormat类中的方法parse,把文本解析为日期
        Date parse(String source)：把符合模式的字符串，解析为Date日期
        1.创建对象SimplDateFormat对象，构造方法中传递指定的模式
        2.调用SimplDateFormat对象中的方法parse,把符合构造方法中模式的字符串解析为date日期
        注意：parse方法声明一个异常叫ParseException解析异常
        如果字符串和构造方法中模式不一样，那么程序就抛出异常
        调用一个抛出异常的方法，就必须得处理这个异常，要么throws继续声明抛出这个异常，要么try..catch自己处理这个异常

     */
    private static void Demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-03-05 23:00:04");
        System.out.println(date);
    }
}
