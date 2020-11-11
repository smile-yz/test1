package com.my.package9;
import java.io.*;
/*

 */
public class Demo386CopyFile2 {
    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\test.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\test2.png"));
        //一次读取一个字节，写入一个字节方式
        //复制文件共使用：47毫秒
        /*int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节
        //复制文件共使用：5毫秒
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
        long a = System.currentTimeMillis();
        System.out.println("复制文件共使用：" + (a-s) +  "毫秒");
    }
}
