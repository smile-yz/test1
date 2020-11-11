package com.my.package1;
/*
数字和字符的对照关系表（编码表）
ASCII码表：American Standard code for Information Interchange,美国信息交换标准代码
Unicode码表：万国码。也是数字和符号的对照关系，开头0-127部分和ASCII完全一样，但是从128开始包含有更多字符

 */
public class Demo03DataTypeChar {
    public static void main(String[] args) {
       char zifu1 = '0';
       System.out.println(zifu1 + 0); //48

       char zifu2 = 'A';
       System.out.println(zifu2 + 0); //65
       char zifu3 = 'a';
       int num = zifu3;
       System.out.println(num); //97

       char zifu4 = '中';
       System.out.println(zifu4 + 0);//20013
    }
}
