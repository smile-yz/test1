package com.my.package4;

public interface Demo183MyInterfaceB {
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault() {
        System.out.println("默认方法BBB");
    }
}
