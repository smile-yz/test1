package com.my.package8;
import java.io.FileOutputStream;
import java.util.Arrays;
/*
一次写多个字节的方法：
public void write(byte[] b) :将b.length字节从指定的字节组写入此输出流
public void write(byte[],int off,int len)：从指定的字节数组写入len字节，从偏移量off开始输处到此输出流
 */
public class Demo363OutputStream {
    public static void main(String[] args) throws Exception {
        //创建FileOutputStream对象，构造方法中绑定写入数据目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\b.txt");

        //调用FileOutputStream对象中的方法write，把数据写入文件中
        //在文件中显示100
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
        public void write(byte[] b) :将b.length字节从指定的字节组写入此输出流
        一次写多个字节：如果第一个字节是正数（0-127），那么会查询ASCII表
                       如果第一个字节是负数，那么第一个字节和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）

         */
        byte[] bytes = new byte[] {65, 66, 67, 68, 69};
        byte[] bytes1 = new byte[] {-65, -66, -67, -68, 69};
        fos.write(bytes);//ABCDE
        fos.write(bytes1);//烤郊E


        //public void write(byte[],int off,int len)：从指定的字节数组写入len字节，从偏移量off开始输处到此输出流
        //int off:数据开始的索引
        //int len:写几个字节
        fos.write(bytes,1,3);//BCD

        //写入字符的方法，使用String类中的方法吧字符串转换为字节数组
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);
        fos.write("你好".getBytes());

        //释放资源
        fos.close();

    }
}
