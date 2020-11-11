package com.my.package9;
import java.io.*;

/*
文件复制
 */
public class Demo386CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\test.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\test1.png");
       //单个读取，单个写入需要6140毫秒
        /* int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }*/

        //多个读取多个写入需要11毫秒
       int len = 0;
       byte[] bytes = new byte[1024];
       while ((len = fis.read(bytes)) != -1) {
           fos.write(bytes,0,len);
       }

        fos.close();
        fis.close();
        long a = System.currentTimeMillis();
        System.out.println("复制文件共使用：" + (a-s) +  "毫秒");



    }
}
