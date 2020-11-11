package com.my.package6;
/*
含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
相当于定义了含有泛型的类，创建对象的时候确定泛型的类型
 */
public class Demo250GenericInterfaceImpl2<fx> implements Demo250GenericInterface<fx>{
    @Override
    public void method1(fx c) {
        System.out.println(c);
    }
}
