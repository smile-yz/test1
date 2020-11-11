package com.my.package9;
import java.io.FileWriter;
/*
java.io.Writer:字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类
共性的成员方法：
void write(int c)写入单个字符
void write(char[] cbuf) 写入字符数组
abstract void write(char[] cbuf,int off,int len)写入字符数组的某一部分，off数组的开始索引，len写的字符个数
void write(String str)写入字符串
void write(String str,int off,int len)写入字符串的某一部分,off数组的开始索引，len写的字符个数
void flush()刷新该流的缓冲
void close()关闭此流，但要先刷新它

java.io.FileWriter extends OutputStreamWrite extends Writer
FileWriter:文件字符输出流
作用:把内存中字符数据写入到文件中

构造方法：
    FileWriter(File file)根据给定的File对象构造一个FileWriter对象
    FiLeWriter(String name)根据给定的文件名构造一个FileWriter对象
 */
public class Demo373Writer {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\f.txt");

        fw.write(97);
        fw.flush();
        fw.close();



    }
}
