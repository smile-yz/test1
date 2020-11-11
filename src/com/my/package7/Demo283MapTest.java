package com.my.package7;
import java.util.Scanner;
import java.util.HashMap;
/*
练习：
计算输入字符串中每个字符出现次数
分析：
1.使用Scanner获取用户输入的字符串
2.创建Map集合，Key是字符串中的字符，Value是字符串中字符个数
3.遍历字符串，获取每一个字符
4.使用获取的字符，用Map集合判断key是否存在
key存在：通过字符(key)获取vlaue（字符个数）value++
put(key,value)把新的value存储到Map集合中
key不存在：
put(key,1)
5.遍历输入结果
 */
public class Demo283MapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();
        //2.创建Map集合，Key是字符串中的字符，Value是字符串中字符个数
        HashMap<Character,Integer> map = new HashMap<>();
        //3.遍历字符串，获取每一个字符
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            } else {
                map.put(c,1);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "有 " + value + " 个");
        }
    }
}
