package com.my.package4;
/*
如何才能知道一个父类引用的对象，本来是什么子类
格式：
对象  instanceof 类型
这样将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例
 */
public class Demo192Instanceof {
    public static void main(String[] args) {
        Demo190Animal animal = new Demo190Dog();
        animal.eat();
        //如果希望调用子类特有方法，需要向下转型
        //在知道的情况下，正常写法
        Demo190Dog dog1 = (Demo190Dog) animal;
        dog1.eat();
        System.out.println("================================================================");
        //判断一下父类引用animal本来是不是dog
        //若判断父类对象animal引用的子类是Demo190Dog，则成功向下转型，否则转型不成功。
        if (animal instanceof Demo190Dog) {
            Demo190Dog dog = (Demo190Dog) animal;
            dog.watchHouse();
        } else {
            System.out.println("父类对象animal引用的子类不是Demo190Dog！！！！！！");
        }
        System.out.println("========================================================");
        //若判断父类对象animal引用的子类是Demo190Cat，则成功向下转型，否则转型不成功。
        if (animal instanceof Demo190Cat) {
            Demo190Cat cat2 = (Demo190Cat) animal;
            cat2.catchMouse();
        } else {
            System.out.println("父类对象animal引用的子类不是Demo190Cat！！！！！！");
        }
        System.out.println("===============================");

        giveMeAPet(new Demo190Dog());
        giveMeAPet(new Demo190Cat());
    }

    public static void giveMeAPet(Demo190Animal animal) {
        if (animal instanceof Demo190Dog) {
            Demo190Dog dog = (Demo190Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Demo190Cat) {
            Demo190Cat cat = (Demo190Cat) animal;
            cat.catchMouse();
        }
    }
}
