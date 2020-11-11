package com.my.package10;
/*Class对象功能：
  获取功能：
        1.获取成员变量们
        Field[] getFields()：获取所有public修饰的成员变量
        Field getField(String name)

        Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field getDeclaredField(String name)
        2.后去构造方法们
        Constructor<?>[] getConstructors()
        Constructor<T> getConstructor(类<?>... parameterTypes)

        Constructor<T> getDeclaredConstructor<类<?>... parameterTypes)
        Constructor<?>[] getDeclaredConstructors()
        3.获取成员方法们
        Method[] getMethods()
        Method getMethod(String name,类<?>... parameterTypes)

        Method[] getDeclaredMethods()
        Method getDeclaredMethod(String name,类<?>... parameterTypes)
        4.获取类名
        * String getName()
*/

import java.lang.reflect.Field;

public class Demo463Reflect {
    public static void main(String[] args) throws Exception {
        //0.获取Demo467Person的Class对象
        Class personClass = Demo467Person.class;
        /*
        1.获取成员变量们
        Field[] getFields()：获取所有public修饰的成员变量
        Field getField(String name)

        Field[] getDeclaredFields()
        Field getDeclaredField(String name)
         */
        //1.Field[] getFields()：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field fi : fields) {
            System.out.println(fi);
        }
        System.out.println("==========================");
        //Field getField(String name)
        Field a = personClass.getField("a");

        //获取成员变量a的值
        Demo467Person person = new Demo467Person();
        Object value = a.get(person);
        System.out.println(value);
        //设置a的值
        a.set(person,"张三");
        System.out.println(person);

        System.out.println("=================================");

        //Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //忽略安全的访问的权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(person);
        System.out.println(value2);//null


    }

}
