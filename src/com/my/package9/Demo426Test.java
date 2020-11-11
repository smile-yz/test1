package com.my.package9;

import java.util.function.Supplier;

/*
练习：求数组元素最大值
使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
提示：接口的泛型请使用java.lang.Integer类
 */
public class Demo426Test {
    //定义一个方法，用于获取int类型数组中，元素的最大值，方法的参数传递Suplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
    public static void main(String[] args) {
        //定义一个int类型的数组，并赋值
        int[] arr = new int[] {100, 0, -50, 888, 99, 33, -30};
        //调用getMax方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        int maxValue = getMax(() -> {
            //获取数组最大值，并返回
            //定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的最大值
            int max = arr[0];
            //遍历数组获取数组中其他的元素
            for(int i : arr) {
                //使用其他的元素和最大值比较
                if (i > max) {
                    max = i;
                }
            }
            //返回最大值
            return max;
        });
        System.out.println("arr数组中最大值：" + maxValue);
    }
}
