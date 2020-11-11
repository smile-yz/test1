package com.my.package7;
import java.util.List;
import java.util.Set;
import java.util.Map;

/*
JDK9的新特性：
List接口、Set接口、Map接口里边增加了静态方法of,可以给集合一次性添加多个元素
使用前提：当集合中存储的元素的个数已经确定了，不再改变时使用
注意：1.of方法只适用于List接口、Set接口、Map接口，不适用于接口的实现类
     2.of方法的返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，会抛出异常
     3.Set接口和Map接口再调用方法of方法的时候，不能有重复元素，否则会抛出异常
 */
public class Demo284JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "d", "c");
        System.out.println(list);//[a, b, a, d, c]

//        Set<String> set = Set.of("a", "b", "a", "d", "c");//IllegalArgumentException非法参数异常，重复参数
//        System.out.println(set);

        Map<String,Integer> map = Map.of("张三",19,"李四",19);//{李四=19, 张三=19}
        System.out.println(map);
    }
}
