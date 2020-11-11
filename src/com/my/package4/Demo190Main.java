package com.my.package4;
/*
向上转型一定是安全的，没有问题的，正确的。但也有一个弊端:
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容

向上转型格式：
父类名称 对象名 = new 子类名称();
向下转型格式：
子类名称 对象名 = (子类名称) 父类对象；

解决方法：用对象的向下转型【还原】
 */
public class Demo190Main {
    public static void main(String[] args) {
       //对象的向上转型，就是：父类引用指向之类对象
       Demo190Animal animal = new Demo190Cat();
       animal.eat();

       //向下转型，进行"还原"动作
        Demo190Cat cat = (Demo190Cat) animal;
       cat.catchMouse();

       //下面是错误的向下转型
        //向下转型的条件是必须有与此类向上转型成功的父类对象名称，不能是其他父类子类的对象名称
        Demo190Dog dog = (Demo190Dog) animal;

        //以下是正确实例
//        Demo190Animal animal1 = new Demo190Dog();
//        Demo190Dog dog = (Demo190Dog) animal1;
    }
}
