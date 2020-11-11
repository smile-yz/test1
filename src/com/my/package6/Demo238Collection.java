package com.my.package6;
import java.util.Collection;
import java.util.ArrayList;
/*
java.util.Collection接口：所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
任意的单列集合都可以使用Collection接口中的方法

共性的方法:
    public boolean add(E e):把给定的对象添加到当前集合中
    public void clear():清空集合所有的元素
    public boolean remove(E e):把给定的对象在当前集合中删除
    public boolean contains(E e):判断当前集合中是否包含给定的对象
    public boolean isEmpty():判断当前集合是否为空
    public int size():返回集合中元素的个数
    public Object[] toArray():把集合中的元素，存储到数组中

 */
public class Demo238Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[] 重写了toString方法

        //public boolean add(E e):把给定的对象添加到当前集合中
        boolean b1 = coll.add("张山");
        System.out.println("b1: " + b1);//b1true
        System.out.println(coll);//[张山]
        coll.add("李思");
        coll.add("王伍");
        coll.add("赵琉");
        System.out.println(coll);

        //public bollean remove(E e):把给定的对象在当前集合中删除
        boolean b2 = coll.remove("李思");
        System.out.println(b2);
        System.out.println(coll);
        boolean b3 = coll.remove("马尔扎哈");
        System.out.println(b3);
        System.out.println(coll);

        //public boolean contains(E e):判断当前集合中是否包含给定的对象
        boolean b4 = coll.contains("李思");
        System.out.println(b4);//false
        boolean b5 = coll.contains("王伍");
        System.out.println(b5);//true

        //public bollean isEmpty():判断当前集合是否为空
        boolean b6 = coll.isEmpty();
        System.out.println(b6);//false

        //public int size():返回集合中元素的个数
        int size = coll.size();
        System.out.println(size);//3

        //public Object[] toArray():把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + "、");
        }
        System.out.println();
        //public void clear():清空集合所有的元素
        coll.clear();
        System.out.println("coll:" + coll);
        boolean b7 = coll.isEmpty();
        System.out.println(b7);//true
    }
}
