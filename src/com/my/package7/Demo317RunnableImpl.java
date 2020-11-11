package com.my.package7;
/*
实现麦票案例出现了安全问题，有重复票
解决线程安全问题，第一种方法：使用同步代码块
格式：
    sysnchronized(锁对象） {
        可能会出现线程安全问题代码（访问了共享数据的代码）
    }
注意：
1.通过代码块中的锁对象，可以使用任意的对象
2.但是必须保证多个线程使用的锁对象是同一个
3.锁对象作用：
    把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class Demo317RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;

    //创建锁对象
    Object obj = new Object();


    @Override
    public void run() {
    //判断票是否存在
        while(true) {
            //同步代码块
            synchronized(obj) {
                if (ticket > 0) {
                    //提高安全问题的概率，让程序睡眠以下
//                    try {
//                        Thread.sleep(10);
//                    } catch(InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    //票存在卖票tiket
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
