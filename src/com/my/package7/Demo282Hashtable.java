package com.my.package7;
import java.util.HashMap;
import java.util.Hashtable;
/*
java.util.Hashtable<K,V>集合 implements Map<K,V>接口
Hashtalbe:底层是哈希表，是一个安全的集合，是单线程集合，速度慢
HashMap:底层是哈希表，是一个线程不安全的集合，是多线程集合，速度快

Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合（HashMap,ArrayList)取代了
Hashtable的子类Properties依然活跃在历史的舞台
Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo282Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b","b");
        map.put("a","a");
        map.put("a","b");
        map.put("b",null);
        map.put("c",null);
        map.put(null,null);
        System.out.println(map);

        //不允许存入空   null
        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a");
        //table.put("b",null);
        //table.put(null,null);
        table.put("a","a");
        System.out.println(table);
    }
}
