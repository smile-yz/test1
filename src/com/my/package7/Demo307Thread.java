package com.my.package7;
/*
创建多线程程序的第一种方式：创建Thread类的子类
java.lang.Thread类：是描述线程的类，想实现多线程必须继承此类
实现步骤：
    1.创建一个Thread类的子类
    2.在Thread类的子类中冲写Thread类中的run方法，设置线程任务
    3.创建Thread类的对象
    4.调用Thread类中的方法start方法，开启新的线程，执行run方法
        void start() 使该线程开始执行
Java程序属于抢占式调度


 */
public class Demo307Thread {
    public static void main(String[] args) {
        Demo307MyThread mt = new Demo307MyThread();
        mt.start();

        for (int i = 0;i < 20;i++) {
            System.out.println("main: " + i);
        }
    }
}
