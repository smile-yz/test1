package com.my.package7;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
/*
java.util.linkedHashMap<K,V> extends HashMap<K,V>
Map接口的哈希表和连接列表实现，具有可预知的迭代顺序。
底层原理：
    哈希表+链表（记录元素的顺序）
 */
public class Demo281LinkedHashMap {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);
        for (String s : map.keySet()) {
            String s2 = map.get(s);
            System.out.println(s + "-->" + s2);
        }
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-=-" + value);
        }

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        System.out.println(linked);
        for (String key : linked.keySet()) {
            String value = linked.get(key);
            System.out.println(key + "=" + value);
        }

        Set<Map.Entry<String,String>> set1 = linked.entrySet();
        Iterator<Map.Entry<String,String>> it1 = set1.iterator();
        while (it1.hasNext()) {
            Map.Entry<String,String> entry = it1.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }


    }
}
