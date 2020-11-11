package com.my.package9;
import java.io.FileWriter;
public class Demo377Writer {
    public static void main(String[] args) throws Exception {
       FileWriter fw = new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\h.txt",true);
       for (int i = 1; i <= 10; i++) {
           fw.write("Hello World!" + i + "\n");
       }
       fw.close();
    }
}
