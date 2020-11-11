package com.my.package10;

import java.lang.reflect.Method;

@Demo474Pro(className = "com.my.package10.Demo474Test1",methodName = "show")
public class Demo474ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo474ReflectTest> reflectTestClass = Demo474ReflectTest.class;
        //System.out.println(reflectTestClass);//class com.my.package10.Demo474ReflectTest

        //2.获取上边的注解对象
        //其实就是在内存中生成一个该注解接口的子类实现对象
        Demo474Pro an = reflectTestClass.getAnnotation(Demo474Pro.class);
        //System.out.println(an);//@com.my.package10.Demo474Pro(className="com.my.package10.Demo474Test1", methodName="show")

        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        //System.out.println(className);//com.my.package10.Demo474Test1
        //System.out.println(methodName);//show

        //4.加载该类进内存
        Class cls = Class.forName(className);
        //System.out.println(cls);//class com.my.package10.Demo474Test1

        //5.创建对象
        //Object obj = cls.newInstance();
        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println(obj);//com.my.package10.Demo474Test1@5910e440
        //6.获取方法对象
        Method method = cls.getMethod(methodName);
        //System.out.println(method);//public void com.my.package10.Demo474Test1.show()
        //7.执行方法
        method.invoke(obj);


    }
}
