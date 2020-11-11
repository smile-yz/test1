package com.my.package4;

public abstract class Demo183MyInterfaceAbstract implements Demo183MyInterfaceA,Demo183MyInterfaceB {
    @Override
    public void methodA() {

    }
    @Override
    public void methodAbs() {

    }
    @Override
    public void methodDefault() {
        System.out.println("abs对于重名的默认方法重写");
    }
}
