package com.my.package4;
//子类也是一个抽象类
public abstract class Demo168Dog extends Demo168Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
//    public abstract void sleep();
}
