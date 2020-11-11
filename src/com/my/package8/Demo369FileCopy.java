package com.my.package8;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo369FileCopy {
    public static void main(String[] args) throws Exception{
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\d.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\e.txt");
        /*int len = 0;
        while((len = fis.read()) != -1) {
            fos.write(len);
        }*/
        //使用数组缓冲，读取多个字节，写入多个字节
        byte[] bytes1 = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes1)) != -1) {
            fos.write(bytes1,0,len);
        }

        fos.close();
        fis.close();
        long a = System.currentTimeMillis();
        System.out.println("读取写入共耗时: " + (a-s) + "毫秒");

        FileInputStream fis1 = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\e.txt");
        byte[] bytes = new byte[1024];
        while((len = fis1.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis1.close();

        long e = System.currentTimeMillis();
        System.out.println("读取共耗时: " + (e-a) + "毫秒");
        System.out.println("读取写入在读取共耗时: " + (e-s) + "毫秒");
    }
}
