package com.my.package8;
import java.io.File;

public class Demo354Recurison {
    public static void main(String[] args) {
        getAllFile(new File("C:\\Users\\yz\\Desktop\\共用图"));

    }
    public static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()) {
                getAllFile(f);
            }
            System.out.println(f);
        }
    }
}
