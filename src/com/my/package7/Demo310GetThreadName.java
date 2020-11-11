package com.my.package7;

public class Demo310GetThreadName {
    public static void main(String[] args) {
        //创建Thread子类的对象
        Demo310MyThread mt = new Demo310MyThread();
        //调用start，开启新线程，执行run方法
        mt.start();//Thread-0  //Thread[Thread-0,5,main]

        Demo310MyThread mt1 = new Demo310MyThread();
        mt1.start();//getName方法：Thread-1  //currentThread方法：Thread[Thread-1,5,main]

        new Demo310MyThread().start();

        System.out.println(Thread.currentThread().getName());//main
    }
}
