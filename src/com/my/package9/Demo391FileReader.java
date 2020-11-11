package com.my.package9;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader可以读取默认编码格式（UTF-8）的文件
读取系统默认编码（中文GBK）会产生乱码

 */
public class Demo391FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\yz\\Desktop\\共用图\\GBK.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);//乱码
            System.out.println(len);
        }
        fr.close();
    }
}
