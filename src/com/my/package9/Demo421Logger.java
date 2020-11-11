package com.my.package9;
/*
日志案例
一下代码存在性能浪费问题
调用showLog方法，传递第二个参数是一个拼接后的字符串
先把字符串拼接好，在调用showLog方法
showLog方法中如果传递的日志等级不是1级，就不会输出拼接后的字符串，所以字符串白拼接，存在浪费
 */
public class Demo421Logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level,String message) {
        //对日志的等级进行判断，如果是1级别，那么输出日志信息
        if(level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello ";
        String msg2 = "world ";
        String msg3 = "java";
        //调用showLog方法传递日志级别和日志信息
        showLog(1,msg1 +msg2 + msg3);


    }
}
