package com.my.package4;
/*
注意，不能通过接口实现类的对象来调用接口当中的静态方法
正确用法：通过接口名称，直接调用其中的静态方法
 */
public class Demo178Interface {
    public static void main(String[] args) {
        //创建实现类对象
        Demo178MyInterfaceStaticImpl impl = new Demo178MyInterfaceStaticImpl();
        //错误写法
//        impl.methodStatic;
        Demo177MyInterfaceStatic.methodStatic();

    }
}
