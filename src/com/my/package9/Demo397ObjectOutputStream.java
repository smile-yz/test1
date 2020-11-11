package com.my.package9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream extends OutputStream
ObjectOutputStream对象的序列化流
构造方法：
ObjectOutputStream(OutputStream out)：创建写入指定OutputStream的ObjectOutputStream
OutputStream out；字节输出流
特有的成员方法：
void writeObject(Object obj)将指定的对象写入ObjectOutputStream

使用步骤：
1.创建ObjectOutputStream对象，构造方法中传递字节输入流
2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
3.释放资源



 */
public class Demo397ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\obj.txt"));
        oos.writeObject(new Demo397Person("迪丽热巴",18));
        oos.close();

    }
}
