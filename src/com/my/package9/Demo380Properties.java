package com.my.package9;
import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
Properties类表示了一个持久的属性集，Properties可保存在流中或者从流中加载
Properties集合是一个唯一和IO流想结合的集合
方法：
Object setProperty(String key,String value) 调用Hashtable的方法put
String getProperty(String key) 通过key找到value值，此方法相当于Map中的get(key)方法
Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应的值是字符串，此方法相当于Map集合中keySet方法

 */
public class Demo380Properties {
    public static void main(String[] args) throws IOException {
        show01();
        System.out.println("=======================");
        show02();
        System.out.println("=======================");
        show03();
    }

    public static void show01() {
        Properties prop = new Properties();
        //Object setProperty(String key,String value)
        prop.setProperty("迪丽热巴","122");
        prop.setProperty("古力娜扎","133");
        prop.setProperty("马尔扎哈","155");

        //String getProperty(String key)
        System.out.println(prop.getProperty("迪丽热巴"));

        //Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应的值是字符串，此方法相当于Map集合中keySet方法
        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            //String getProperty(String key)
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    /*
    void store(OutputStream out,String comments)
    void store(Writer writer,String comments)
    OutputStream out 字节输出流，不能写入中文
    Writer writer 字符输出流，可以写中文
    String comments 用来解释说明保存的文件是什么作用的
    不能使用中文，会产生乱码，默认是Unicode编码
    一般使用“” 空字符串

     */
    public static void show02() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴","122");
        prop.setProperty("古力娜扎","133");
        prop.setProperty("马尔扎哈","155");

        FileWriter fw = new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\k.txt");
        prop.store(fw,"save date");
        fw.close();

        prop.store(new FileOutputStream("C:\\Users\\yz\\Desktop\\共用图\\l.txt"),"");
    }

    /*
    void load(InputStream inStream)
    void load(Reader reader)
    InputStream inStream:字节输入流，不能读取含有中文的键值对
    Reader reader：字符输入流，能读取含有中文的键值对
     */
    public static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("C:\\Users\\yz\\Desktop\\共用图\\k.txt"));

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
