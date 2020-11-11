package com.my.package4;

public interface Demo183MyInterfaceA {
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }
}
