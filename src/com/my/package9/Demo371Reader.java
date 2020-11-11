package com.my.package9;
import java.io.Reader;
import java.io.FileReader;


/*
java.io.Reader字符输入流，抽象类
int read() 读取单个字符并返回
int read(char[] cbuf) 一次读取多个字符，将字符放入数组
void close() 关闭该流并释放与之关联的资源

java.io.FileReader extends InputStreadReader extends Reader
FileReader:文件字符输入流
作用：把硬盘文件中的数据以字符的方式读取到的内存中

构造方法：
FileReader(String fileName)
FileReader(File file)
 */
public class Demo371Reader {
    public static void main(String[] args) throws Exception {
        FileReader freader = new FileReader("C:\\Users\\yz\\Desktop\\共用图\\e.txt");

        //int read() 读取单个字符并返回
        /*int len = 0;
        while ((len = freader.read()) != -1) {
            System.out.print((char)len);
        }*/

        //int read(char[] cbuf) 一次读取多个字符，将字符放入数组
        int len = 0;
        char[] ch = new char[1024];
        while ((len = freader.read(ch)) != -1) {
            /*
            String类中构造方法
            String(char[] value) 把字符数组转换为字符串
            String(char[] value,int offset,itn count) 把字符数组一部分转换为字符串，offset数组开始的索引，count 转换的个数
             */
            System.out.println(new String(ch,0,len));
        }


        freader.close();



    }
}
