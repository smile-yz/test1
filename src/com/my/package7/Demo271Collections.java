package com.my.package7;
import java.util.ArrayList;
import java.util.Collections;

/*
public static <T> boolean addAll(Collection<T> c,T...elements):往集合中添加一些元素
public static void shuffle(List<?> list)：打乱顺序，打乱集合顺序
public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
public static <T> void sort(List<T> list,Comparator<？ super T>):将集合中元素按照指定规则排序
 */
public class Demo271Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");

        Collections.addAll(list,"a","b","c","d");
        list.add("a");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("====================");

        //数字排序
        ArrayList<Integer> num = new ArrayList<>();
        Collections.addAll(num,1,4,5,2,3,3,6);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        //字符排序
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Demo272Person> list01 = new ArrayList<>();
        list01.add(new Demo272Person("张山",19));
        list01.add(new Demo272Person("李思",20));
        list01.add(new Demo272Person("王伍",15));
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);
    }
}
