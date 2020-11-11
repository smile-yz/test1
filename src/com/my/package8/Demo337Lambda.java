package com.my.package8;

public class Demo337Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程
        new Thread(new Demo336RunnableImpl() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();

        //使用Lambda表达式，实现多线陈
        new Thread(()-> {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }).start();

        //优化省略Lambda
        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + "新线程创建了")
        ).start();
    }
}
