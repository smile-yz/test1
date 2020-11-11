package com.my.package8;
import java.io.FileOutputStream;
/*
java.io.OutputStream ： 字节输出流

java.io.FileOutputStream extends: 文件字节输出流
作用：把内存中的数据写入到硬盘文件中
FileOutputStream(String name):创建一个向具有指定名称的文件中写入数据的输出文件流
FileOutputStream(File file)：创建一个向指定File对象标识的文件中写入数据的文件输出流

字节输出流的使用步骤：
1.创建FileOutputStream对象，构造方法中传入写入数据的目的地
2.调用FileOutputStream对象中的方法write把数据写入到文件中
3.释放资源（流使用会占用一定的内存，使用完毕要把占用的内存清空，提高程序效率）
 */
public class Demo360OutputStream {
    public static void main(String[] args) throws Exception{
        //1.创建FileOutputStream对象，构造方法中传入写入数据的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\a.txt");

        //2.调用FileOutputStream对象中的方法write把数据写入到文件中
        fos.write(65);

        //3.释放资源（流使用会占用一定的内存，使用完毕要把占用的内存清空，提高程序效率）
        fos.close();

    }
}
