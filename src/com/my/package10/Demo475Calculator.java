package com.my.package10;

public class Demo475Calculator {
    //加法
    @Demo475Check
    public void add() {
        System.out.println("1 + 0 =" + (1 + 0));
    }
    //减法
    @Demo475Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }
    //乘法
    @Demo475Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }
    //除法
    @Demo475Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }
    public void show() {
        System.out.println("永无bug。。。");
    }

}
