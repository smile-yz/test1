package com.my.package1;
/*
变量：程序运行期间，内容可以发生改变的量

整数型 byte short int long
浮点型 float double
字符型 char
布尔型 boolean
注意事项：
1.字符串不是基本类型，而是引用类型。
2.浮点型可能只是一个近似值，并非精确值。
3.数据范围与字节数不一定相关，例如float数据范围比long更加广泛，但是float是4字节，long是8字节。
4.浮点数当中默认类型是double，如果一定要使用float类型，需要加上一个后缀F。
  如果是整数，默认为int类型，如果一定要使用long类型，需要加上一个后缀F。推荐使用大写字符后缀。
 */
public class Demo02Variable {
    public static void main(String[] args) {
        //格式：数据类型  变量名称；
        int num1;
        //格式：变量名称 = 数据值;
        num1 = 10;
        System.out.println(num1);
        //改变变量中的值
        num1 = 20;
        System.out.println(num1);
        //使用一步到位的格式来定义变量
        //格式；数据类型 变量名称 = 数据值;
        int num2 = 25;
        System.out.println(num2);
        num2 = 26;
        System.out.println(num2);
        System.out.println("============");
        //注意：右侧数值得范围不能超过右侧数据类型的取值范围
        byte num3 = 30;
        System.out.println(num3);
        short num4 = 50;
        System.out.println(num4);
        long num5 = 300000000L;
        System.out.println(num5);

        float num6 = 2.5F;
        System.out.println(num6);

        double num7 = 1.2;
        System.out.println(num7);

        char zifu1 = 'A';
        System.out.println(zifu1);

        zifu1 = '中';
        System.out.println(zifu1);

        boolean var1 = true;
        System.out.println(var1);

        var1 = false;
        System.out.println(var1);

        //将一个变量的数据内容，赋值交给另一个变量
        //右侧的变量名称var1已经存在，里面装的是false布尔值
        //将右侧变量里面的false值，向左边的var2变量进行存储
        boolean var2 = var1;
        System.out.println(var2);
    }
}
