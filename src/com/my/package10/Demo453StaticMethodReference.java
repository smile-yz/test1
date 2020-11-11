package com.my.package10;

/*
通过类名引用静态成员方法
类已经存在，静态成员方法也已经存在
就可以通过类名直接引用静态方法
 */
public class Demo453StaticMethodReference {
    //定义一个方法，方法的参数传递要计算绝对值的整数和函数式接口Demo453Calcable
    public static int method(int number,Demo453Calcable c) {
        return c.calcAbs(number);
    }
    public static void main(String[] args) {
        //调用method方法，传递计算绝对值得整数和lambda表达式
        int number = method(-10,(n) -> {
            return Math.abs(n);
        });
        System.out.println(number);
        /*
        使用方法引用优化Lambda表达式
        Math类存在
        abs计算绝对值的静态方法也是存在的
        所以可以直接通过类名引用静态方法
         */
        int number2 = method(-10,Math :: abs);
        System.out.println(number2);


    }
}
