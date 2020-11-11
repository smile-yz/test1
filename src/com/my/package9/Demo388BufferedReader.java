package com.my.package9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
java.io.BufferedReader extends Reader
BufferedReader 字符缓冲输入流

构造方法
BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流
BufferedReader(Reader in,int sz)创建一个使用指定大小输入缓冲区的缓冲字符输入流
参数：
Reader in:字符输入流，传递FileReader
int se:定缓冲流内部缓冲区的大小，不指定默认

特有的成员方法
String readLine() 读取一个文本行，读取一行数据
返回值：包含该行的内容字符串，不包含任何终止符，如果已达到流末尾，则返回null

使用步骤：
1.创建字符缓冲输入流对象，构造方法中传递字符输入流
2.使用字符缓冲输入流对象中的方法read/readLine读取文本
3.释放资源
 */
public class Demo388BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\yz\\Desktop\\共用图\\o.txt"));
        /*String line = br.readLine();//读取一行数据
        System.out.println(line);*/

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
