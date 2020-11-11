package com.my.package8;
import java.io.File;
/*
File类获取功能的方法
public String getAbsolutePath(): 返回此File的绝对路径名字符串
public String getPath(): 将此File抓换位路径名字符串
public String getName(): 返回此File表示的文件或者目录的名称
public lang length() : 返回此File表示的文件的长度

 */
public class Demo347File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();

    }
    //public String getAbsolutePath(): 返回此File的绝对路径名字符串
    //输出为绝对路径
    public static void show01() {
        File f1 = new File("C:\\Users\\yz\\Desktop\\orcale\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//C:\Users\yz\Desktop\orcale\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\JavaProject\a.txt
    }

    //public String getPath(): 将此File抓换位路径名字符串
    //输入的什么值，输出什么值
    public static void show02() {
        File f1 = new File("D:\\JavaProject\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);//D:\JavaProject\a.txt
        String path2 = f2.getPath();
        System.out.println(path2);//a.txt
    }

    //public String getName(): 返回此File表示的文件或者目录的名称
    public static void show03() {
        File f1 = new File("D:\\JavaProject\\a.txt");
        File f2 = new File("a.txt");
        String name1 = f1.getName();
        String name2 = f2.getName();
        System.out.println(name1);//a.txt
        System.out.println(name2);//a.txt
    }

    //public long length() : 返回此File表示的文件的长度
    public static void show04() {
        File f1 = new File("C:\\Users\\yz\\Desktop\\共用图\\微信截图_20200314220349.png");
        File f2 = new File("共用图");//会在相对路径查找，这里默认相对路径是此类包的根目录
        File f3 = new File("C:\\Users\\yz\\Desktop\\大数据");
        long a1 = f1.length();
        long a2 = f2.length();
        System.out.println(a1);//1146301字节
        System.out.println(a2);//0,不存在返回0
        System.out.println(f3.length());
    }


}
