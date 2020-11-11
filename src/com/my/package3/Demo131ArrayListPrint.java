package com.my.package3;
import java.util.ArrayList;
/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起集合，使用@分割元素
格式参照{元素@元素@元素}
System.out.println(list);  [10, 20, 30]
printArrayList(list);      {10@20@30}
 */
public class Demo131ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        printArrayList(list);
    }

    /*
    定义方法三要素：
    返回值类型：只是打印，没有运算，没有结果，所以用void
    方法名称：printArrayList
    参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list) {
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size();i++) {
            String name = list.get(i);
            if(i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}
