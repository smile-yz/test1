package com.my.package8;
/*
测试类：
    包含main方法，程序执行的入口，启动程序
    创建包子对象，创建包子铺线程，开启，创建吃货线程，开启
 */
public class Demo332Test {
    public static void main(String[] args) {
        //创建包子对象
        Demo331BaoZi bz = new Demo331BaoZi();
        new Demo331BaoZiPu(bz).start();
        new Demo332ChiHuo(bz).start();
    }
}
