package com.my.package8;
/*
等待唤醒案例：线程之间的通信
void wait() 等待
void notify() 唤醒
 */
public class Demo326WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个线程进行
                synchronized(obj) {
                    System.out.println("告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子已经做好了，开吃了");
                }
            }
        }.start();

        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                //花五秒做包子
                try {
                    Thread.sleep(5000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(obj) {
                    System.out.println("老板五秒做好包子之后告诉顾客包子好了,可以吃包子了");
                    obj.notify();
                }
            }
        }.start();
    }
}
