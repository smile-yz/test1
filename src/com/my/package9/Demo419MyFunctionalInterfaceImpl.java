package com.my.package9;
/*
@Override注解
检查是否为重写的方法
是：编译成功
否：编译失败
 */

public class Demo419MyFunctionalInterfaceImpl implements Demo419MyFunctionalInterface {
    @Override
    public void method() {
        System.out.println("实现类");
    }
    /*@Override
    public void method2() {

    }*/
}
