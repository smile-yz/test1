package com.my.package4;
//键盘就是USB设备
public class Demo194Keyboard implements Demo194USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }
    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void type() {
        System.out.println("键盘输入");
    }
}
