package com.my.package3;
/*
String当中与获取相关的常用方法有：
public int length():获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */
public class Demo137StringGet {
    public static void main(String[] args) {
       int length = "asdfasdfaggadgahasddjhasdu".length();
        System.out.println("字符串的长度是：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println("拼接后的字符串是：" + str3);//HelloWorld
        System.out.println("哇哈".concat("哈"));

        //获得指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果们没有，返回-1值
        String orignal = "HelloWorldHelloWorld";
        int index = orignal.indexOf("llo");
        System.out.println("第一次索引值是：" + index);
        System.out.println("HelloWorld".indexOf("abc"));


    }
}
