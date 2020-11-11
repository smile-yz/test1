package com.my.package9;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/*
java.io.BufferedOutputStream extends OutputStream
BufferedOutputStream 字节缓冲输出流
构造方法：
BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的地城输出流
BufferedOutputStream(OutputStream out,int size)创建一个新的缓冲输出流，以将具有只当缓冲区的大小的数据写入指定的底层输出流
参数：
OutputStream out 字节输出流，可以传递FileOutputStream,缓冲流会给FileOutputStream增加缓冲区，提高FileOutputStream的写入效率
int size 指定缓冲流内部缓冲区的大小，不指定默认
使用步骤：
1.创建字节输出流FileOutputStream对象，构造方法中绑定输出的目的地
2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
3.使用BufferedOutputStream对象中的方法Write，把数据写入到内部缓冲区中
4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区的数据，刷新到文件中
5.释放资源
 */
public class Demo384BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流FileOutputStream对象，构造方法中绑定输出的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\m.txt");
        //2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.使用BufferedOutputStream对象中的方法Write，把数据写入到内部缓冲区中
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        //4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区的数据，刷新到文件中
        bos.flush();
        //5.释放资源
        bos.close();
    }
}
