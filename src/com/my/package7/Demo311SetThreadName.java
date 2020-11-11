package com.my.package7;

public class Demo311SetThreadName {
    public static void main(String[] args) {
        Demo311MyThread mt = new Demo311MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new Demo311MyThread("旺财").start();
    }
}
