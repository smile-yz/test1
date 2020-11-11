package com.my.package9;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
/*
java.io.BufferedInputStream extends FileInputStream
BufferedInputStream 字节缓冲输入流

构造方法：
BufferedInputStream(InputStream in) 创建一个BufferedInputStream保存其参数，即输入流in,以便将来使用
BufferedInputStream(InputStream in,int size)创建具有只当缓冲区大小的BufferedInputStream并保存其参数，即输入流in,以便将来使用
参数：
InputStream in 字节输入流，可以传递FileInputStream缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
int size 指定缓冲流内部缓冲区的大小，不指定默认

使用步骤：
1.创建FileInputStream对象，构造方法中绑定读取的数据源
2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream的读取效率
3.使用BufferedInputStream对象中的方法read，读取文件
4.释放资源

 */
public class Demo385BufferedInputStream {
    public static void main(String[] args) throws Exception{
        //1.创建FileInputStream对象，构造方法中绑定读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\m.txt");
        //2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.使用BufferedInputStream对象中的方法read，读取文件
        /*int len = 0;
        while ((len = bis.read()) != -1){
            System.out.println(len);
        }*/

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        //4.释放资源
        bis.close();
    }
}
