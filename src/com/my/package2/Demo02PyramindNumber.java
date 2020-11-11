package com.my.package2;

public class Demo02PyramindNumber {
    public static void main(String[] args){
        for (int x= 1;x <= 5;x++) {
            for (int y = 1;y <= 6-x;y++){
                System.out.print(" ");
            }
            //打印空格，填充左上角这块三角形
            for (int y = 1;y <= x;y++){
                System.out.print(y);
            }
            //打印第一块直角三角形
            for (int y = x-1;y >= 1;y--){
                System.out.print(y);
            }
            //打印第二块直角三角形
            System.out.println();
            //换行
        }
    }
}