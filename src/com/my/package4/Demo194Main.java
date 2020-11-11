package com.my.package4;

public class Demo194Main {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Demo194Computer computer = new Demo194Computer();
        computer.powerOn();

        //准备一个鼠标
//        Demo194Mouse mouse = new Demo194Mouse();
        //首先进行向上转型
        Demo194USB usbMouse = new Demo194Mouse();
//        Demo194USB usb = mouse;
        //
        computer.useDevice(usbMouse);
        computer.powerOff();

        System.out.println("======================");
//第一种写法
        //首先打开笔记本电脑
        computer.powerOn();
        //创建键盘
//        Demo194Keyboard keyboard = new Demo194Keyboard();
        //向上转型
        Demo194USB usbKeyboard = new Demo194Keyboard();
        //将转型对象名交给useDevice方法，进行向上转型并且调用方法内容
        computer.useDevice(usbKeyboard);
        //关闭
        computer.powerOff();
        System.out.println("==================================");

//第二种写法
        computer.powerOn();
        //键盘
        Demo194Keyboard keyboard = new Demo194Keyboard();
        //自动向上转型
        computer.useDevice(keyboard);
        //或者
        //这种是与   Demo194USB usbKeyboard = new Demo194Keyboard();   方法相同
        //computer.useDevice(new Demo194Keyboard());
        computer.powerOff();
    }
}
