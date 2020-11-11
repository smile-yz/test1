package com.my.package3;
import java.util.Arrays;
/*
java.util.Arrays是一个于数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
public static String toString(数组):将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，。。。]
public static void sort(数组):按照默认升序对数组的元素排序

备注：
1.若是数值，sort默认按照升序排序
2.若是字符串，sort默认按照字母升序
3.如果是自定义类型，自定义的类需要有Comparable或者Comparator接口的支持
 */
public class Demo148Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30};
        //将数组按照默认格式变成字符串
        System.out.println(intArray);
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = new int[] { 3, 2, 5, 1, 4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = new String[] { "ccc", "bbb", "aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
