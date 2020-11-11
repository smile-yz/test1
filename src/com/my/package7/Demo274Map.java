package com.my.package7;
import java.util.Map;
import java.util.HashMap;
/*
java.util.Map(k,v)集合
特点：
1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
2.Map集合中的元素，key和value数据类型可以相同，也可以不同
3.Map集合中的元素，key是不允许重复的，value是可以重复的
4.Map集合中的元素，key和value是一一对应的

java.util.HashMap(k,v)集合 implements Map(k,v)接口
特点：
    1.HashMap集合底层是哈希表，查询速度快
    2.HashMap集合是一个无序的集合

java.util.LinkedHashMap(k,v)集合 extends HashMap(k,v)集合
特点：
    1.LinkedHashMap集合底层是哈希表+链表
    2.LinkedHashMap集合是一个有序的集合

  public V put(K key,V value):把指定的键和值添加到Map集合中
  public V remove(Object key):把指定的键所对应的元素，在Map集合中删除，返回被删除元素的值。
  public V get (Object key):根据指定的键，在Map集合中获取对应的值
  boolean containsKey(Object key)判断集合中是否包含指定的键
  包含返回true,不包含返回false

 */
public class Demo274Map {
    public static void main(String[] args) {
        show01();
    }
    /*
    public V put(K key,V value):把指定的键和值添加到Map集合中
    存储键值对的时候，key不重复，返回值v是null
    存储键值对的时候，key重复，会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("历程","范冰冰1");
        System.out.println(v1);//null,key不重复，返回null
        System.out.println(map);//{历程=范冰冰1}

        String v2 = map.put("历程","范冰冰2");
        System.out.println(v2);//范冰冰1,key重复，覆盖掉之前的key对应的value值，返回被替换的value值。
        System.out.println(map);//{历程=范冰冰2}

        map.put("11","12");
        map.put("22","22");
        System.out.println(map);

        //remove
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("one",1);
        map1.put("two",2);
        map1.put("tree",3);
        System.out.println(map1);
        Integer remove1 = map1.remove("one");
        System.out.println("被删除的：" + remove1);//被删除的：1
        System.out.println(map1);//{tree=3, two=2}

        Integer get1 = map1.get("two");
        Integer get2 = map1.get("one");
        System.out.println(get1);//2
        System.out.println(get2);//null

        boolean b1 = map1.containsKey("one");
        System.out.println(b1);//false
        boolean b2 = map1.containsKey("two");
        System.out.println(b2);//true
    }
}
