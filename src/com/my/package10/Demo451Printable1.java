package com.my.package10;

public class Demo451Printable1 {
    //定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Demo451Printable p) {
        p.print("HelloWorld");
    }
    public static void main(String[] args) {
        //调用printString方法，方法的参数Demo451Printtable是一个函数式接口，所以可以传递Lambda表达式
        printString(s -> System.out.println(s));

    /*
    分析：
    Lambda表达式的目的，打印参数传递的字符串
    把参数s，传递给System.out对象，调用out对象中的方法println对字符床进行输出
    注意：
    System.out对象是已经存在的
    println方法也是已经存在的
    所以我们可以使用方法引用来优化Lambda表达式
    可以使用System.out方法直接引用（调用）println方法
     */
    printString(System.out::println);
    }
}
