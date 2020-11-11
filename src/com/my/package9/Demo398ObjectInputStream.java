package com.my.package9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
java.io.ObjectInputStream extends InputStream
ObjectInputStream 对象的反序列化流
作用：把文件中保存的对象，以流的方式读取出来使用
构造方法：
ObjectInputStream(InputStream in)创建从指定InputStream读取的ObjectInputStream

特有的成员方法
Object readObject() 从ObjectInputStream读取对象

使用步骤：
1.创建ObjectInputStream对象，构造方法中传递字节输入流
2.使用ObjectInputStream对象中的方法readObject读取保存的对象文件
3.释放资源
4.使用读取出来的对象（打印）

readObject方法声明抛出了ClassNotFoundException（class文件找不到异常）
反序列化前提：
1.类必须实现Serializable接口
2.必须存在类对应的class文件
 */
public class Demo398ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\obj.txt"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
        Demo397Person p = (Demo397Person)obj;
        System.out.println(p.getName() + p.getAge());

    }
}
