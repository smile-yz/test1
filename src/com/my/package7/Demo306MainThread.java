package com.my.package7;
/*
主线程：执行主（main）方法的线程
单线程程序：java程序中只有一个线程
执行从main开始，从上到下依次执行
 */
public class Demo306MainThread {
    public static void main(String[] args) {
        Demo306Person person = new Demo306Person("小强");
        person.run();

        Demo306Person person2 = new Demo306Person("旺财");
        person2.run();
    }
}
