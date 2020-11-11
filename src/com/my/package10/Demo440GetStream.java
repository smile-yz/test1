package com.my.package10;

import java.util.*;
import java.util.stream.Stream;


/*
java.util.stream.Stream<T> 不是一个函数式接口
-所有的Collection集合都可以通过stream默认方法获取流：
default Stream<E> stream()
Stream接口的静态方法of可以获取数组对应的流
Static <T> Stream<T> of(T...values)
参数是一个可变参数，那么我们就可以传递一个数组
 */
public class Demo440GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，存储到Set集合中
        Set<String> keyset = map.keySet();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对（键与值得映射关系entrySet）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> entream5 = entries.stream();

        //把数组转换为数组流
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5);
        //可变参数可以传递数组
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);
        String[] arr2 = new String[] {"a", "bb", "ccc"};
        Stream<String> stream8 = Stream.of(arr2);


    }
}
