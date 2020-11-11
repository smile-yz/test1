package com.my.package8;
/*
创建Runnable接口实现类，重写run方法，设置线程任务
 */
public class Demo336RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程创建了a ");
    }

}
