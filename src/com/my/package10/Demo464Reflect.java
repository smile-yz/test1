package com.my.package10;

import java.lang.reflect.Constructor;

/*
2.后去构造方法们
        Constructor<?>[] getConstructors() //返回public的构造方法
        Constructor<T> getConstructor(类<?>... parameterTypes)

        Constructor<T> getDeclaredConstructor<类<?>... parameterTypes) //返回所有修饰符的构造方法
        Constructor<?>[] getDeclaredConstructors()
Constructor：构造方法
创建对象：
    T newInstance(Object... initargs)
    如果构造使用空参数构造方法创建对象，操作可简化：Class对象的newInstance方法
 */
public class Demo464Reflect {
    public static void main(String[] args) throws Exception {
        //0.获取Demo467Person的Class对象
        Class personClass = Demo467Person.class;
        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("张三",23);
        System.out.println(person);

        System.out.println("====================");

        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

        System.out.println("====================================");
        //Constructor<?>[] getConstructors()
        Constructor[] constructor2 = personClass.getConstructors();
        for(Constructor c : constructor2) {
            System.out.println(c);
        }
        System.out.println("=========================");
        //Constructor<T> getDeclaredConstructor<类<?>... parameterTypes)
        Constructor constructor3 = personClass.getDeclaredConstructor();
        System.out.println(constructor3);
        System.out.println("=============================");
        Constructor[] constructor4 = personClass.getDeclaredConstructors();
        for (Constructor d : constructor4) {
            System.out.println(d);
        }


    }
}
