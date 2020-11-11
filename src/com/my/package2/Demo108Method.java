package com.my.package2;

import java.util.Arrays;

/*
面向对象三大特征：封装、继承、多态
封装性在Java当中的体现：
1.方法就是一种封装
2.关键字private也是一种封装
 */
public class Demo108Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100 };
        int max = getMax(array);
        System.out.println("最大值：" + max);
        getMax(array);
        System.out.println(Arrays.toString(array));//按格式输出
        java.util.Arrays.sort(array);//排序
        System.out.println(Arrays.toString(array));


    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


}
