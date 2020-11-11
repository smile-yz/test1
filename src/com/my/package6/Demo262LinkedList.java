package com.my.package6;
import java.util.LinkedList;
/*
java.util.LinkedList集合implements list 接口
LinkedList集合特点：
1.底层是一个链表结构：查询慢，增删快
2.里边包含了大量操作首尾元素的方法
注意：使用LindedList集合特有的方法不能使用多态。
public void addFirst(E e)：将指定元素插入到此列表的开头
public void push(E e): 将元素推入此列表所表示的堆栈
public void addLast(E e): 将指定元素插入到此列表的结尾

public E getFirst(): 返回此列表的第一个元素
public E getLast(): 返回此列表的最后一个元素

public E removeFirst(): 移除并返回第一个元素
public E pop(): 从此列表所表示的堆栈出弹出一个元素
public E removeLast(): 移除并返回最后一个元素




public bollean isEmpty(): 如果列表不包含元素，则返回true
public void clear(): 清空所有元素
 */
public class Demo262LinkedList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        //创建对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        //开头结尾添加元素
        linked.addFirst("one");//等效于linked.push("one");
        linked.push("one1");
        linked.addLast("two");
        System.out.println(linked);

        //获取第一个元素和最后一个元素
        String First = linked.getFirst();
        System.out.println("第一个元素：" + First);
        String Last = linked.getLast();
        System.out.println("最后一个元素：" + Last);

        //public bollean isEmpty(): 如果列表不包含元素，则返回true
       //linked.clear();
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first+ "\t" + last);
        }

        //移除
        //String remove1 = linked.removeFirst();//等效于linked.pop();
        String remove1 = linked.pop();
        String remove2 = linked.removeLast();
        System.out.println(remove1 + "\t" + remove2);
        System.out.println(linked);


    }
}
