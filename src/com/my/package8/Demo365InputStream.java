package com.my.package8;
import java.io.FileInputStream;
/*
java.io.InputStream:字节输入流
int read()从输入流中读取数据中的下一个字节
int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
void close() 关闭输入流并释放与该流关联的所有系统资源。

java.io.FileInputStream extends InputStream

 */
public class Demo365InputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\c.txt");
       /* System.out.println(fis.read());
        int a = fis.read();
        System.out.println(a);
        System.out.println(fis.read());//没有了就是-1*/

       int len = 0;
       while ((len = fis.read()) != -1) {
           System.out.print((char)len);//Aa
       }
        fis.close();

    }
}

