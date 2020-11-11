package com.my.package4;
//鼠标就是一个USB设备
public class Demo194Mouse implements Demo194USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }
    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public void clik() {
        System.out.println("鼠标点击");
    }

}
