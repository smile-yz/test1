package com.my.package9;
import java.io.FileInputStream;
/*

 */
public class Demo370InputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\e.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
