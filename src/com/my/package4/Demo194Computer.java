package com.my.package4;

public class Demo194Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }
    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }
    //使用USB设备的方法
    public void useDevice(Demo194USB usb) {
        usb.open();
        if (usb instanceof Demo194Mouse) {
            Demo194Mouse usbMouse = (Demo194Mouse) usb;
            usbMouse.clik();
        } else if (usb instanceof Demo194Keyboard) {
            Demo194Keyboard usbKeyboard = (Demo194Keyboard) usb;
            usbKeyboard.type();
        }

        usb.close();
    }
}
