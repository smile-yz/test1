package com.my.package10;
import java.util.stream.Stream;
/*
Stream流中常用方法 forEach
void forEach(Consumer<? super T> action);
该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理
Consumer接口是一个消费型函数式接口，可以传递Lambda表达式，消费数据

简单记：
forEach方法用来遍历流中的数据
是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 */
public class Demo441Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三","李思","王五","赵六","田七");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        /*stream.forEach((String name) -> {
            System.out.println(name);
        });*/
        //优化Lambda
        stream.forEach(name -> System.out.println(name));



    }
}
