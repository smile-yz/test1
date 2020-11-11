package com.my.package8;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Arrays;

/*
String类的构造方法
String(byte[] bytes) 把字节数组转换为字符串
String(byte[] bytes,int offset,int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引，length:转换字节的个数
 */

public class Demo368InputStream {
    public static void main(String[] args) throws Exception {
        /*FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\d.txt");
        byte[] bytes = new byte[] { 97, 98, 99, 100 };
        fos.write(bytes);
        fos.close();*/


        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\d.txt");
        /*byte[] byte1 = new byte[3];
        int len = fis.read(byte1);
        System.out.println(len);//4
        System.out.println(Arrays.toString(byte1));//[97, 98, 99, 100]
        System.out.println(new String(byte1));//abcd*/

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes));//多余更多的空格
            //String(byte[] bytes,int offset,int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引，length:转换字节的个数
            System.out.println(new String(bytes,0,len));//只读取有效的字符
        }


        fis.close();

    }
}
