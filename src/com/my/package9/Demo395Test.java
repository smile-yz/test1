package com.my.package9;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
练习：转换文件编码
将GBK编码的文本文件，转换为UTF-8编码的文本文件
分析：
1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
3.使用IntputStreadReader对象中的方法read读取文件
4.使用OutputStreamWriter对象中的方法write把读取的数据写入到文件中
5.释放资源
 */
public class Demo395Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\gbk.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\test.txt"),"UTF-8");

        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }

        osw.close();
        isr.close();

    }
}
