package com.my.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRun {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一个整数：");
            String str1 = bufferedReader.readLine();
            Integer int1 = Integer.valueOf(str1);
            System.out.println("输入的整数是：" + int1);

            System.out.println("请输入一个浮点数：");
            String str2 = bufferedReader.readLine();
            Double double1 = Double.valueOf(str2);
            System.out.println("输入的浮点数是：" + double1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
