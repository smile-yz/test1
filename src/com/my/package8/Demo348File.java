package com.my.package8;
import java.io.File;
/*
public boolean exists():此File表示文件或者目录是否真实存在
public boolean isDirectory():此File表示是否为目录
public boolean isFile():此File表示是否为文件
 */
public class Demo348File {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用图");
        File f2 = new File("共用图");
        boolean b1 = f1.exists();
        boolean b2 = f2.exists();
        System.out.println(b1);//true
        System.out.println(b2);//false

        File f3 = new File("C:\\Users\\yz\\Desktop\\共用图\\微信截图_20200314220349.png");
        boolean b3 = f3.exists();
        System.out.println(b3);//ture
        System.out.println("=============================");

        File f4 = new File("C:\\Users\\yz\\Desktop\\共用图");
        File f5 = new File("C:\\Users\\yz\\Desktop\\共用图\\微信截图_20200314220349.png");
        boolean b4 = f4.isDirectory();
        boolean b5 = f5.isDirectory();
        System.out.println(b4);//true
        System.out.println(b5);//false  不是目录或不存在返回false
        System.out.println("=============================");

        File f6 = new File("C:\\Users\\yz\\Desktop\\共用图");
        File f7 = new File("C:\\Users\\yz\\Desktop\\共用图\\微信截图_20200314220349.png");
        boolean b6 = f6.isFile();
        boolean b7 = f7.isFile();
        System.out.println(b6);//false  结尾不是文件或者不存在返回false
        System.out.println(b7);//true  确定为文件结尾返回true

        if(f6.exists()) {
            System.out.println(f6.isDirectory());
            System.out.println(f6.isFile());
        }

    }
}
