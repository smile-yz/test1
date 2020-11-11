package com.my.package8;
import java.io.File;
/*
File类遍历（文件夹）目录功能
public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或目录
 */
public class Demo350File {
    public static void main(String[] args) {
        show01();
        show02();
    }
    public static void show01() {
        //获取文件夹下的所有文件/文件夹
        //可以获取隐藏文件夹
        //文件夹路径不存在或者结尾不是文件夹而是文件，则抛出空指针异常
        //打印出来的是相对路径
       File f1 = new File("C:\\Users\\yz\\Desktop\\共用图");
       String[] arr = f1.list();
       for (String s : arr) {
           System.out.println(s);
       }
    }

    public static void show02() {
        //打印出来的是绝对路径
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用图");
        File[] f2 = f1.listFiles();
        for (File f3 : f2) {
            System.out.println(f3);
        }
    }
}
