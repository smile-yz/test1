package com.my.package6;
/*
测试含有泛型的接口
 */
public class Demo250GenericInterfaceTest {
    public static void main(String[] args) {
        //创建实现类1对象
        Demo250GenericInterfaceImpl gi1 = new Demo250GenericInterfaceImpl();
        gi1.method1("Java");

        //创建实现类2对象
        Demo250GenericInterfaceImpl2 gi2 = new Demo250GenericInterfaceImpl2();
        gi2.method1("haha");
        gi2.method1(111);
        gi2.method1(true);

        //创建实现类2给定泛型数据类型
        Demo250GenericInterfaceImpl2<String> gi3 = new Demo250GenericInterfaceImpl2<>();
        gi3.method1("哇哈哈");
    }
}
