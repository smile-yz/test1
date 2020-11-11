package com.my.package9;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
/*
java.io.OutputStreamWriter extends Writer
OutputStreamWriter:是字符流通向字节流得桥梁，可使用指定的charset将要写入流中的字符编码成字节。
构造方法：
OutputStreamWriter(OutputStream out) 创建使用默认的字符编码OutputStreamWriter
OutputStreamWriter(OutputStream out,String charsetName) 创建使用指定字符集的OutputStreamWriter
参数：
OutputStream out 字节输出流，可以用来写转换之后的字节到文件中
String charsetName:指定的编码名称，不区分大小写，可以是utf-8/UTF-8,gbk/GBK

使用步骤：
1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码表的名称
2.使用OutputStreamWriter对象中的方法Write，把字符转换为字节存储缓冲区中（编码）
3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
4.释放资源
 */
public class Demo393OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
        write_gbk();
    }
    //使用转换流OutputStreamWriter写UTF-8格式的文件
    public static void write_utf_8() throws IOException {
        //1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码表的名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\utf_8.txt"),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\utf_8.txt"));
        //2.使用OutputStreamWriter对象中的方法Write，把字符转换为字节存储缓冲区中（编码）
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4.释放资源
        osw.close();
    }
    public static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\gbk.txt"),"gbk");
        osw.write("你好");
        osw.flush();
        osw.close();

    }
}

