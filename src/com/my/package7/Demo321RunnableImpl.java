package com.my.package7;
/*
解决线程安全问题的第二种方案：使用同步方法
使用步骤:
    1.把访问了共享数据的代码抽取出来，放到一个方法中
    2.在方法上添加synchronized修饰符
格式：
修饰符 synchronized 返回值类型 方法名（参数列表）{
    可能会出现线程安全问题的代码（访问了共享数据的代码）
}
 */
public class Demo321RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;

    //创建锁对象
    Object obj = new Object();


    @Override
    public void run() {
        //判断票是否存在
        while(true) {
            payTicketStatic();

        }
    }

    /*
    定义一个同步方法
    静态的同步方法的锁对象是谁
    不是this，this是创建对象之后产生的，静态方法优先于对象
    静态方法的锁对象是本类的class属性-->class文件对象
     */
    public static /*synchronized*/ void payTicketStatic() {
        synchronized(Demo321RunnableImpl.class) {
            if (ticket > 0) {
                //提高安全问题的概率，让程序睡眠以下
//                    try {
//                        Thread.sleep(10);
//                    } catch(InterruptedException e) {
//                        e.printStackTrace();
////                    }
                //票存在卖票tiket
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
