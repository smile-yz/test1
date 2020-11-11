package com.my.package10;
/*
通过对象名引用成员方法
使用前提是对象已经存在的，成员方法也是已经存在的
就可以使用对象名来引用成员方法
 */
public class Demo452ObjectMethodReference {
    //定义一个方法，方法的参数传递Demo451Printable即可
    public static void printString(Demo451Printable p) {
        p.print("Hello");
    }
    public static void main(String[] args) {
        //调用printString方法，方法的参数Demo451Printable是一个函数式接口，所以可以使用Lambda表达式
        printString((s) -> {
            //创建Demo452MethodRefObject
            Demo452MethodRefObject obj  = new Demo452MethodRefObject();
            //调用obj中的成员方法printUpperCaseString
            obj.printUpperCaseString(s);
        });

        /*
        使用方法引用优化Lambda
        对象已经存在的Demo452MethodRefObject
        成员方法也是已经存在的printUpperCaseString
        所以可以使用对象名引用成员方法
         */
        Demo452MethodRefObject obj  = new Demo452MethodRefObject();
        printString(obj :: printUpperCaseString);
    }
}
