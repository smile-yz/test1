package com.my.package10;
import java.util.function.Consumer;
/*
java.util.function.Consumer<T>接口与Supplier相反，不是生产一个数据，而是消费一个数据，其数据类型由泛型决定
Consumer接口中包含抽象方法 void accept(T t) 意为消费一个指定类型的数据
Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
至于具体怎么消费（使用），需要自定义（输出，计算。。）
 */
public class Demo427Consumer {
    /*
    定义一个方法，方法的参数传递一个字符串姓名，方法的参数传递Consumer接口，泛型使用String
    可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name,Consumer<String> con) {
        con.accept(name);
    }
    public static void main(String[] args) {
        method("迪丽热巴",(String name) -> {
            //消费方法：直接输出
            System.out.println(name);

            //消费方式：把字符串反转输出
            String reName = new StringBuilder(name).reverse().toString();
            String reName1 = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
            System.out.println(reName1);
        });
    }
}
