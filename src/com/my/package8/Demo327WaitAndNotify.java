package com.my.package8;
/*
进入到TimeWaiting(计时等待)有两种方式
1.使用sleep(long m)方法,在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动唤醒，线程睡醒进入到Runnable/Blocked状态

 唤醒的方法：
 1.void notify()
 2.void notifyAll()
 */
public class Demo327WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个线程进行
                while(true) {
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃了");
                        System.out.println("=============================");
                    }
                }
            }
        }.start();

        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个线程进行
               while(true) {
                   synchronized (obj) {
                       System.out.println("顾客2告知老板要的包子的种类和数量");
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       //唤醒之后执行的代码
                       System.out.println("包子已经做好了，顾客2开吃了");
                       System.out.println("=============================");
                   }
               }
            }
        }.start();

        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                //花五秒做包子
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板五秒做好包子之后告诉顾客包子好了,可以吃包子了");
//                        obj.notify();//随机唤醒一个线程
                        obj.notifyAll();//唤醒所有的线程
                    }
                }
            }
        }.start();
    }
}
