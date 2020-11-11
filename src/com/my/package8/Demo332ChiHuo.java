package com.my.package8;
/*
消费者（吃货）类：是一个线程类，可以继承Thread
    设置线程任务（run）：吃包子
    对包子状态进行判断
    false:没有包子
           吃货线程调用wait方法进入等待状态
    true: 有包子
            吃货吃包子
            吃完包子
            修改包子状态false没有包子了
            吃货唤醒包子铺线程，生产包子

 */
public class Demo332ChiHuo extends Thread {
    //1.需要成员位置创建包子变量
    private Demo331BaoZi bz;
    //2.使用带参数构造方法，为包子变量赋值
    public Demo332ChiHuo(Demo331BaoZi bz) {
        this.bz = bz;
    }
//    设置线程任务（run）：吃包子
    @Override
    public void run() {
        //使用死循环，让吃货一直吃包子
        while (true) {
           //必须同时同步技术保证两个线程只能有一个在执行
            synchronized(bz) {
                //对包子状态进行判断
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行代码，吃包子
                System.out.println("吃货正在吃:" + bz.pi + bz.xian + "的包子");
                //吃完包子
                //修改包子状态
                bz.flag = false;
                //唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把：" + bz.pi + bz.xian + "的包子吃完了，包子铺开始生产包子");
                System.out.println("===============================================");
            }
        }
    }
}
