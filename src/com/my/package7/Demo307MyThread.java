package com.my.package7;

public class Demo307MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < 20;i++) {
            System.out.println("run: " + i);
        }
    }
}
