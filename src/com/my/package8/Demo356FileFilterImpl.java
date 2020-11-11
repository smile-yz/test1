package com.my.package8;
import java.io.FileFilter;
import java.io.File;
public class Demo356FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
       //return true;
        //判断结尾是.txt返回true，不是返回false
        //如果pathname是文件夹也返回true继续遍历文件夹
        if(pathname.isDirectory()) {
            return true;
        } else {
            return pathname.getName().toLowerCase().endsWith(".txt");
        }
    }
}
