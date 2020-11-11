package com.my.package9;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/*
java.io.BufferedWriter extends Writer
BufferedWriter字符缓冲输出流

构造方法：
BufferedWriter(writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流
BufferedWriter(writer out,int sz)创建一个使用给定大小输出缓冲区的心缓冲字符输出流
参数：
Writer out 字符输出流
int sz 定缓冲流内部缓冲区的大小，不指定默认

特有的成员方法
void newline() 写入一个行分隔符，根据不同的操作系统，获取不同的行分隔符
使用步骤：
1.创建字符缓冲输出流对象，构造方法中传递字符输出流
2.调用字符缓冲输出流中的write，把数据写入到内存缓冲区中
3.调用字符缓冲输出中的方法flush，把内存缓冲区中的数据，刷新到文件中
4.释放资源


 */
public class Demo387BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\o.txt"));
        for (int i = 0;i <= 10;i++) {
            bw.write("Hello");
            //bw.write("\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();




    }
}
