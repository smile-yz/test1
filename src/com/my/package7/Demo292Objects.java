package com.my.package7;
import java.util.Objects;
/*
Objects类中的静态方法
public static <T> T requireNonNull(T obj):查看指定引用对象不是null
源码：
public static <T> T requireNonNullO(T obj) {
    if (obj == null)
        throw new NullPointerException();
    return obj;
}
 */
public class Demo292Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj) {
        /*if(obj == null) {
            throw new NullPointerException("传递的对象值是null");
        }*/
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象值是null");
    }
}
