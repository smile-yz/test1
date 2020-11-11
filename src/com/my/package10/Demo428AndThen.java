package com.my.package10;
import java.util.function.Consumer;
/*
Consumer接口默认方法andThen
作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，再对数据进行消费
 */
public class Demo428AndThen {
    public static void method(String s,Consumer<String> con1,Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        //使用andThen方法，把两个Consumer接口连接到一块，再消费数据
        con1.andThen(con2).accept(s);
    }
    public static void main(String[] args) {
        method("abcd",
                (t) -> {
                    //消费方式：把字符串转换为大写输出
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    //消费方式：把字符串转换为小写输出
                    System.out.println(t.toLowerCase());
                });
    }


}
