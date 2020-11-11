package com.my.package8;

import java.io.File;

public class Demo355Recurison {
    public static void main(String[] args) {
        getAllFile(new File("C:\\Users\\yz\\Desktop\\共用图"));

    }
    public static void getAllFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()) {
                getAllFile(f);
            }
            //打印.txt结尾文件
            //1.把File对象f转换为字符串对象
            //String name = f.getName(); //获取路径结尾的文件/文件夹名称
            //String path = f.getPath(); //获取输入的路径
//            String s = f.toString();  //与getPath方法相同
//                s = s.toLowerCase();
//
//                //2.调用String类中的endsWith判断字符是否以.txt结尾
//                boolean b = s.endsWith(".txt");
//
//                //3 如果是以.txt结尾的文件则输出就可以了
//                if (b ) {
//                    System.out.println(f);
//            }

            //简化代码
            if (f.getName().toLowerCase().endsWith(".txt")) {
                System.out.println(f);
            }
        }
    }
}
