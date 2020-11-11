package com.my.package4;

public interface Demo184MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault() {
        System.out.println("AAA");
    }
}
