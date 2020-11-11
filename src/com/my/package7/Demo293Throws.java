package com.my.package7;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws关键字：异常处理的第一种方法，交给别人处理
格式：
修饰符  返回值类型  方法名（参数列表） throws AAAException,BBBException...{
        throw new AAAException("产生原因");
        throw new BBBException("产生原因");
        ...
}

注意：
 1.throws关键字必须写在方法声明处
 2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
 3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
    如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
 4.调用一个声明抛出异常的方法，我们就必须处理声明的异常
   要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
   要么try..catch自己处理异常
 */
public class Demo293Throws {
    public static void main(String[] args) throws Exception/*FileNotFoundException,IOException*/{
        readFile("c:\\\\a.txt");
    }

    /*
    定义一个方法，对传递的文件路径进行合法性判断
    如果路径不是“c:\\a.txt”那么抛出文件找不到异常，告知方法的调用者
     */
    public static void readFile(String filename) throws Exception/*FileNotFoundException,IOException*/ {
        if (!filename.equals("c:\\\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是c:\\\\a.txt");
        }


        /*
        如果传递的路径，不是.txt结尾
        那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对,不是.txt");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
