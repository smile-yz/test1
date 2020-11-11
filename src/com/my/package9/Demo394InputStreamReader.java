package com.my.package9;
import java.io.*;

/*
java.io.InputStreamReader extends Reader
InputStreamReader:是字节输入流通向字符流的桥梁，使用指定的charset读取字节并将其解码为字符。
构造方法：
    InputStreamReader(InputStream in) 创建一个使用默认字符的集InputStreamReader
    InputStreamReader(InputStream in,String charsetName)创建使用指定字符集的InputStreamReader

使用步骤:
1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
2.使用InputStreamReader对象的方法read读取文件
3.释放资源
 */
public class Demo394InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
        read_gbk();
    }
    public static void read_utf_8() throws IOException {
        //不指定默认使用idea中编码
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\utf_8.txt"),"UTF-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\utf_8.txt"));
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }
    public static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\gbk.txt"),"GBK");
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }
}
