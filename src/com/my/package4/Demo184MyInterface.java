package com.my.package4;
/*
此子接口中有4个方法
methodA来源于接口A
methodB来源于接口B
methodCommon来源于接口A和B
method来源于自己
 */
public interface Demo184MyInterface extends Demo184MyInterfaceA,Demo184MyInterfaceB {
    public abstract void method();
    @Override
    public default void methodDefault() {

    }
}
