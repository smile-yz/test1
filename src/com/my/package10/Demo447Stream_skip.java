package com.my.package10;
import java.util.stream.Stream;
/*
Stream<T> skip<long n>如果流的当前长度大于n,则跳过前n个，否则将会得到一个长度为0的空流
 */
public class Demo447Stream_skip {
    public static void main(String[] args) {
        String[] arr = new String[] {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach(name -> System.out.println(name));//"灰太狼", "红太狼"
    }
}
