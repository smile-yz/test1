package com.my.package10;

import java.lang.reflect.Method;

/*
3.获取成员方法们
        Method[] getMethods()获取所有public修饰的方法
        Method getMethod(String name,类<?>... parameterTypes)

        Method[] getDeclaredMethods()
        Method getDeclaredMethod(String name,类<?>... parameterTypes)
 */
public class Demo465Reflect {
    public static void main(String[] args) throws Exception {
        Class personClass = Demo467Person.class;
        //Method[] getMethods()  获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for(Method a:methods) {
            System.out.println(a);
            String name = a.getName();
            System.out.println(name);
        }
        System.out.println("===============================");
        //Method getMethod(String name,类<?>... parameterTypes)
        Method method1 = personClass.getMethod("eat");
        Demo467Person p = new Demo467Person();
        System.out.println(method1);
        System.out.println("=================================");
        method1.invoke(p);

        Method method2 = personClass.getMethod("eat",String.class);
        method2.invoke(p,"饭");
        System.out.println("=================================");

        //Method[] getDeclaredMethods()

        //获取类名
        String className = personClass.getName();
        System.out.println(className);

    }
}
