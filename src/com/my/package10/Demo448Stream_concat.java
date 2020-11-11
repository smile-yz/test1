package com.my.package10;
import java.util.stream.Stream;
/*
如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
static<T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo448Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //获取一个Stream流
        String[] arr = new String[] {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream,stream1);
        concat.forEach(name -> System.out.println(name));
//        long count = concat.count();
//        System.out.println(count);

    }
}
