package com.my.package7;

public class Demo321Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Demo321RunnableImpl run = new Demo321RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();

    }
}
