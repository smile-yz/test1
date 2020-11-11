package com.my.package7;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
线程安全问题的第三种方法：使用lock锁
java.util.concurrent.locks.Lock接口
Lock实现提供了比使用synchronized方法和语句可获得更广泛的锁定操作
Lock接口中的方法：
    void lock() 获取锁
    void unlock() 释放锁
java.util.concurrent.locks.ReentrantLock implements Lock接口
使用步骤：
    1.在成员位置创建一个ReentrantLock对象
    2.可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
    3.可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁

 */
public class Demo323RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;
//    1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();




    @Override
    public void run() {
        //判断票是否存在
        while(true) {
            // 2.可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();
            if (ticket > 0) {
                //提高安全问题的概率，让程序睡眠以下
//                    try {
//                        Thread.sleep(10);
//                    } catch(InterruptedException e) {
//                        e.printStackTrace();
////                    }
                //票存在卖票tiket
                try {
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }
            }
        }
    }

    /*
    定义一个同步方法
    静态的同步方法的锁对象是谁
    不是this，this是创建对象之后产生的，静态方法优先于对象
    静态方法的锁对象是本类的class属性-->class文件对象
     */


}
