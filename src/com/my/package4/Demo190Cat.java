package com.my.package4;

public class Demo190Cat extends Demo190Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
    //子类特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
