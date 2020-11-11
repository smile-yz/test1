package com.my.package7;
import java.io.IOException;
/*
Throwable类中定义了三个异常处理的方法
String getMessage() 返回此throwable的简短描述
String toString() 返回此throwable的详细消息字符串
void printStackTrace() JVM打印异常对象，默认此方法，打印的异常信息是最全面的
 */
public class Demo295Throwable {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch(IOException e) {
//            System.out.println("catch - 传递的文件后缀不是.txt");
            System.out.println(e.getMessage());//文件的后缀名不对,不是.txt
            System.out.println(e.toString());//java.io.IOException: 文件的后缀名不对,不是.txt
            System.out.println(e);//java.io.IOException: 文件的后缀名不对,不是.txt

           /* java.io.IOException: 文件的后缀名不对,不是.txt
            at com.my.package7.Demo295Throwable.readFile(Demo295Throwable.java:25)
            at com.my.package7.Demo295Throwable.main(Demo295Throwable.java:12)*/
            e.printStackTrace();//打印所有异常7信息
        }
        System.out.println("后续代码");
    }

    public static void readFile(String filename) throws IOException {
        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对,不是.txt");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
