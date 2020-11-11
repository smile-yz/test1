package com.my.package2;
import java.util.Random;
public class Demo122Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
