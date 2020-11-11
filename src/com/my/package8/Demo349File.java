package com.my.package8;
import java.io.File;
import java.io.IOException;

/*
public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
注：此方法只能创建文件，不能创建文件夹，创建文件路径必须存在，否则抛出异常
public boolean delete()：删除由此File表示的文件或目录
public boolean mkdir()：创建由此File表示的目录
public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录
 */
public class Demo349File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }
    public static void show01() {
        //创建文件
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用图\\a.txt");
        try {
            //若不存在，便创建返回true，若存在返回false，路径不存在抛出异常
            System.out.println(f1.createNewFile());
        } catch(IOException e) {
            e.printStackTrace();
        }

        File f2 = new File("a.txt");//此项目根目录创建
        try{
            System.out.println(f2.createNewFile());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void show02() {
        //创建单级文件夹
        //若文件夹不存在，创建文件夹返回true
        //若文件夹存在，返回false,路径不存在，返回false
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用图\\a文件夹");
        System.out.println(f1.mkdir());

        //创建多级文件夹
        //路径不存在，则创建目录路径
        File f2 = new File("C:\\Users\\yz\\Desktop\\共用图\\a文件夹\\bb\\cc");
        System.out.println(f2.mkdirs());
    }

    public static void show03() {
        //删除文件/文件夹方法
        //删除成功返回true
        //路径不存在返回false,文件夹当中由子文件/文件夹不能删除返回false
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用\\a文件夹");
        System.out.println(f1.mkdirs());
        File f2 = new File("C:\\Users\\yz\\Desktop\\共用\\a文件夹");
        System.out.println(f2.delete());
        File f3 = new File("C:\\Users\\yz\\Desktop\\共用图\\a.txt");
       System.out.println(f3.delete());
       File f4 = new File("haha");
        System.out.println(f4.mkdirs());
    }
}
