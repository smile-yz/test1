package com.my.package7;
/*
匿名内部类方法实现线程的创建
作用：简化代码
格式：
new 父类/接口 () {
    重复父类/接口中的方法
};
 */
public class Demo315InnerClassThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0;i < 20;i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "Hello" + i);
                }
            }
        }.start();

        //线程的接口
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 20;i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "World" + i);
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
