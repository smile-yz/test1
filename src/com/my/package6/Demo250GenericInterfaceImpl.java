package com.my.package6;
/*
含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，指定接口泛型
public interface Iterator<E> {
    E next();
}
Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写next方法泛型默认就是String
public final class Scanner implements Iterator<String> {

}


 */
public class Demo250GenericInterfaceImpl implements Demo250GenericInterface<String>{
    @Override
    public void method1(String a) {
        System.out.println(a);
    }
}
