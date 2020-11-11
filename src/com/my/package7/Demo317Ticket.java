package com.my.package7;
/*
模拟卖票案例
创建三个线程，同时开启，对共享的票出售
 */
public class Demo317Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Demo317RunnableImpl run = new Demo317RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();

    }
}
