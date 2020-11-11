package com.my.package8;
import java.io.FileOutputStream;

/*
追加写/续写：
FileOutputStream(String name,boolean append):创建一个向具有指定name的文件中写入数据的输出文件流
FileOutputStream(File file,boolean append):创建一个向指定File对象表示的文件中写入数据的文件输出流
参数：
String name,File file:写入数据的目的地
boolean append:追加写开关， true:创建对象不会覆盖原文件，继续在文件的末尾追加写数据，
                           false：创建一个新文件覆盖原文件，在新文件中重新写数据
 */
public class Demo364OutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\c.txt",true);

        //换行   \r\n  表示换行
        for(int i = 1;i <= 10; i++) {
            fos.write("你好\r\n".getBytes());
        }

        fos.write("你好".getBytes());
        fos.close();
    }
}
