package com.my.package3;

public class Demo154Fu {
    int numFu = 10;
    int num = 100;
    public void methodFu() {
        //使用的时本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
