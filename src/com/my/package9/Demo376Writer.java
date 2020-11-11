package com.my.package9;
import java.io.FileWriter;
/*
void write(char[] cbuf) 写入字符数组
abstract void write(char[] cbuf,int off,int len)写入字符数组的某一部分，off数组的开始索引，len写的字符个数
void write(String str)写入字符串
void write(String str,int off,int len)写入字符串的某一部分,off数组的开始索引，len写的字符个数
 */
public class Demo376Writer {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\g.txt");

        char[] cs = new char[] {'a', 'b', 'c', 'd', 'e'};
        //void write(char[] cbuf) 写入字符数组
        fw.write(cs);//abcde
        fw.write("\t\n");
        fw.flush();

        //void write(String str,int off,int len)写入字符串的某一部分,off数组的开始索引，len写的字符个数
        fw.write(cs,1,2);//bc
        fw.write("\n");
        fw.flush();

        //void write(String str)写入字符串
        fw.write("Hello Word!");//Hello Word!
        fw.write("\n");
        fw.flush();

        //void write(String str,int off,int len)写入字符串的某一部分,off数组的开始索引，len写的字符个数
        fw.write("Hello Word!",2,3);
        fw.close();
    }
}
