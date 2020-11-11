package com.my.package4;

public interface Demo184MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault() {
        System.out.println("BBB");
    }
}
