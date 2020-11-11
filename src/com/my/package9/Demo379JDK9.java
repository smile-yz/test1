package com.my.package9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Demo379JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fps = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\i.txt");
        FileOutputStream fops = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\g.txt");
        try(fps;fops) {

            int len = 0;
            while ((len = fps.read()) != -1) {
                fops.write(len);
            }
        } catch(IOException e) {
            System.out.println(e);
        }



    }
}
