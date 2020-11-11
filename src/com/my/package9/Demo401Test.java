package com.my.package9;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/*
练习：序列化集合
分析：
1.定义一个存储Person对象的ArrayList集合
2.往ArrayList集合中存储Person对象
3.创建一个序列化流ObjectOutputStream对象
4.使用ObjectOutputStream对象中的方法writeObject对集合进行序列化
5.创建一个反序列化ObjectInputStream对象
6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
7.把Object类型的集合转换为ArrayList类型
8.遍历ArrayList集合
9.释放资源

 */
public class Demo401Test {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //1.定义一个存储Person对象的ArrayList集合
        ArrayList<Demo397Person> list = new ArrayList<>();
        //2.往ArrayList集合中存储Person对象
        list.add(new Demo397Person("迪丽热巴",18));
        list.add(new Demo397Person("古力娜扎",19));
        list.add(new Demo397Person("马尔扎哈",20));
        //3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\list1.txt"));
        //4.使用ObjectOutputStream对象中的方法writeObject对集合进行序列化
        oos.writeObject(list);
        //5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\yz\\Desktop\\共用图\\list1.txt"));
        //6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object o = ois.readObject();
        //7.把Object类型的集合转换为ArrayList类型
        ArrayList<Demo397Person> list2 = (ArrayList<Demo397Person>)o;
        //8.遍历ArrayList集合
        for (Demo397Person p : list2) {
            System.out.println(p);
        }
        //9.释放资源
        oos.close();
        ois.close();
    }
}
