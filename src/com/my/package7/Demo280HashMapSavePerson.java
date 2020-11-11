package com.my.package7;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
/*
HashMap存储自定义类型键值
Map集合保证key是唯一的：
作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo280HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("============================================");
        show02();
    }
    /*
    HashMap存储自定义类型键值

     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Demo280Person>  map = new HashMap<>();
        map.put("北京",new Demo280Person("张三",18));
        map.put("上海",new Demo280Person("李思",29));
        map.put("广州",new Demo280Person("王伍",20));
        map.put("北京",new Demo280Person("赵琉",18));
        map.put("山西",new Demo280Person("赵琉",18));
        //使用keySet增强for遍历
       for (String key : map.keySet()) {
           Demo280Person value = map.get(key);
           System.out.println(key + "-->" + value);
       }
    }

    /*
    key:Demo280Person类型，必须重写hashCode方法和equals方法，以保证key唯一
    value:String类型
    可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Demo280Person,String> map = new HashMap<>();
        map.put(new Demo280Person("古力娜扎",18),"北京");
        map.put(new Demo280Person("迪丽热巴",18),"秦朝");
        map.put(new Demo280Person("马尔扎哈",18),"北京");
        map.put(new Demo280Person("古力娜扎",18),"云南");
        map.put(new Demo280Person("古力娜扎",18),"山西");

        //使用entrySet和增强for遍历map集合
        Set<Map.Entry<Demo280Person,String>> set = map.entrySet();
        for (Map.Entry<Demo280Person,String> entry : set) {
            Demo280Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }
}
