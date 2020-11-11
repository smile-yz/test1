package com.my.package8;
import java.io.File;
/*
java.io.File类
文件和目录路径名的抽象表示形式。
file 文件
directory 文件夹
path 路径
 */
public class Demo343File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//;   路径分隔符，多个路径之间的分隔符
        //windows: 分号";"    Linux:  冒号":"
        String separator = File.separator;
        System.out.println(separator);//  \    文件名称分隔符
        //windows: 反斜杠\    Linux：正斜杠/

        show01();
        System.out.println("============================");
        show02("c:\\","a.txt");//c:\a.txt
        show02("d:\\","a.txt");//d:\a.txt
        System.out.println("============================");

        show03();//c:\Hello.java
    }

    /*
    File(String pathname) 通过将给定路径名字符串转换为抽象路径来创建一个新File实例
    参数：
    String pathname :字符串的路径名称
    路径可以是以文件结尾，也可以是文件夹结尾
    路径可以实相对路径，或者绝对路径
    路径可以存在，也可以不存在
    创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    public static void show01() {
        File f1 = new File("C:\\Users\\yz\\Desktop\\orcale\\a.txt");
        System.out.println(f1);//重写了Object中的toString方法

        File f2 = new File("D:\\学习");
        System.out.println(f2);//重写了Object中的toString方法

        File f3 = new File("学习");
        System.out.println(f3);
    }

    /*
    File(String parent,String child)更具parent路径名字符串和child路径名字符串创建一个新的File实例
    String parent:父路径
    String child: 子路径
    好处：可以独立书写，使用起来更加灵活
     */
    public static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    /*
        File(File parent,String child)更具parent路径名字符串和child路径名字符串创建一个新的File实例
        File parent:父路径
        String child: 子路径
     */
    public static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"Hello.java");
        System.out.println(file);
    }
}
