package com.my.package7;
/*
获取线程名称：
1.使用Thread类中的方法getName9)
String getName() 返回该线程的名称
2.可以获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
static Thread  currentThread() 返回当前正在执行的线程对象的引用
 */
public class Demo310MyThread extends Thread{
    //重写run方法，设置线程任务
    @Override
    public void run () {
        //获取线程名称
//        String name = getName();
//        System.out.println(name);//Thread-1
//        Thread t = currentThread();
//        System.out.println(t);//Thread[Thread-0,5,main]

        System.out.println(Thread.currentThread().getName());
    }
}
