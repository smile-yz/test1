package com.my.package1;
/*
1.对于数值来说，那就是加法
2.对于字符char类型来说，在计算之前，char会被提升称为int，然后计算
char类型字符和int类型数字之间的对照关系表：ASCII、Unicode
3.对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连接操作
任何数据类型和字符串进行连接的时候，结果都会变成字符串
 */
public class Demo05Plus {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println("Hello " + str1); //Hello hello
        System.out.println("Hello " + "World!");//Hello World!

        String str2 = "Java";
        System.out.println(str2 + 20);//Java20
        //优先级问题
        System.out.println(str2 + 20 + 30);//Java2030
        System.out.println(str2 + (20 + 30));//Java50
    }
}
