package com.my.package4;
/*
代码当中体现多态性，就是父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称();
或者
接口名称 对象名 = new 实现类名称();
 */
public class Demo186Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向右侧子类的对象
        Demo186Fu obj = new Demo186Zi();
        obj.method();
        obj.methodFu();
    }
}
