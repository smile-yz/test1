package com.my.package4;

public class Demo180Interface {
    public static void main(String[] args) {
        Demo179MyInterfacePrivateB.methodStatic1();
        Demo179MyInterfacePrivateB.methodStatic2();
        //错误写法
//        Demo179MyInterfacePrivateB.methodStaticCommon();
        System.out.println("=======================================");

        //实现类对象
        Demo180MyInterfacePrivateImpl impl = new Demo180MyInterfacePrivateImpl();
        impl.methodDefault1();
        impl.methodDefault2();
        //错误写法
//        impl.methodCommon;

    }
}
