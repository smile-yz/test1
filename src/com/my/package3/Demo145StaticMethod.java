package com.my.package3;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不是属于对象，而是属于类的
如果没有Static关键字，那么必须创建对象，然后通过对象才能使用它
 注意事项：
 1.静态不能直接访问非静态
 原因：内存当中先有的静态，后有的非静态
 2.静态方法当中不能使用this
 原因：this代表当前对象，通过谁调用的方法，谁就是对象
 */
public class Demo145StaticMethod {
    public static void main(String[] args) {
        //首先需要创建对象，然后才能使用没有static关键字的内容
        Demo145MyClass obj = new Demo145MyClass();
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();//正确，不推荐
        Demo145MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法！");
    }
}
