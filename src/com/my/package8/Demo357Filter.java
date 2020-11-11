package com.my.package8;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo357Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\yz\\Desktop\\共用图");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
       //匿名内部类方法一
        /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                } else {
                    return pathname.getName().toLowerCase().endsWith(".txt");
                }
            }
        });*/

        //匿名内部类方法二
       /* File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir,String name) {
                if (new File(dir,name).isDirectory()) {
                    return true;
                } else {
                    return name.toLowerCase().endsWith("a.txt");
                }
            }
        });*/

        //使用Lambda表达式简化一
       /* File[] files = dir.listFiles((File d,String name) -> {
            if (new File(dir,name).isDirectory()) {
                return true;
            } else {
                return name.toLowerCase().endsWith("a.txt");
            }
        });*/

        //Lamdba优化代码,去掉参数类型，大括号，return,封号
        /*File[] files = dir.listFiles((d,name) ->
            new File(d,name).isDirectory() ||  name.toLowerCase().endsWith(".txt")
        );*/

       //使用Lambda表达式简化er
     /*   File[] files = dir.listFiles((File d) -> {
            if (d.isDirectory()){
                return true;
            } else {
                return d.getName().toLowerCase().endsWith(".txt");
            }
        });*/

     //Lamdba优化代码,去掉参数类型，大括号，return,封号
        File[] files = dir.listFiles(pathname ->
             pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt")
        );



        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
