package com.my.package7;
/*
设置线程的名称：（了解）
    1.使用
 */
public class Demo311MyThread extends Thread {

    public Demo311MyThread(){}
    public Demo311MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
