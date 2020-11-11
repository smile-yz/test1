package com.my.package7;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/*
Map集合的第一种遍历方式：通过键找值
Map集合中的方法：
    Set<K> keySet() 返回此映射中包含间的Set视图
实现步骤；
    1.使用Map集合中的方法keySet(),把Map集合中所有的key取出来，存储到一个set集合中
    2.遍历set集合，获取Map集合中的每一个键
    3.通过Map集合中的get(key)，通过key找到value


Map.Entry<K,V>在Map接口中有一个内部接口Entry
作用：当Map集合创建好，那么就会在Map集合中创建一个Entry对象，用来记录键与值（键值对对象，键与值得映射关系）

Map集合遍历的第二种方法：使用Entry方法
Map集合中的方法：
Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图。

实现步骤：
    1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到Set集合中
    2.遍历Set集合，获取每一个Entry对象
    3.使用Entry对象中的方法getKey()和getValue()获取键与值

 */
public class Demo277KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("老大",1);
        map.put("老二",2);
        map.put("老三",3);
        //方法一：
        //1.使用Map集合中的方法keySet(),把Map集合中所有的key取出来，存储到一个set集合中
        Set<String> keyset = map.keySet();
        //2.遍历set集合，获取Map集合中的每一个键
        Iterator<String> it = keyset.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //3.通过Map集合中的get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("========================");
        for (String key : keyset) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------------------------------------------");
        //方法二：
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("one",1);
        map2.put("two",2);
        map2.put("three",3);
        //1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到Set集合中
        Set<Map.Entry<String,Integer>> set = map2.entrySet();
//        2.遍历Set集合，获取每一个Entry对象
        //使用迭代器
        Iterator<Map.Entry<String,Integer>> it1 = set.iterator();
        while (it1.hasNext()) {
            Map.Entry<String,Integer> entry = it1.next();
//        3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("===================================");
        for (Map.Entry<String,Integer> entry1 : set) {
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
