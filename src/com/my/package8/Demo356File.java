package com.my.package8;

import java.io.File;

/*
File[] listFiles(FileFilter filter)
java.io.FileFilter接口:用于抽象路径名（File对象）的过滤器
作用：用来过滤文件（File对象）
抽象方法：用来过滤文件（File对象）
boolean accept(File pathname) 测试指定抽象路径名是否包含那在某个路径名列表中
参数： File pathname 使用ListFiles方法遍历目录，得到每一个文件对象

File[] listFiles(FilenameFilter filter)
java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
作用：用于过滤文件的方法
boolean accept(File dir,String name) 测试指定抽象路径名是否包含那在某个路径名列表中
参数： File dir:构造方法中传递的被遍历的目录
String name :使用ListFiles方法遍历目录，得到每一个文件/文件夹的名称

注意：两个过滤器接口没有实现类，需自己写实现类，重写过滤方法accept，在方法中定义自己的过滤规则

 */
public class Demo356File {
    public static void main(String[] args) {
        getAllFile(new File("C:\\Users\\yz\\Desktop\\共用图"));

    }
    public static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles(new Demo356FileFilterImpl());//传递过滤器对象
        for (File f : files) {
            if(f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
