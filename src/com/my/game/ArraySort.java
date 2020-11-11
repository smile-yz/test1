package com.my.game;
/*
数组排序:
原始数据：2、1、9、0、5、3、7、6、8
第一次排序：1、2、0、5、3、7、6、8、9
第二次排序：1、0、
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] arrayA = new int[]{ 2, 9, 8, 10, 0, 1, 6, 5, 4 };
        for (int x = 0; x < arrayA.length; x++) {   //控制次数不能大于数组长度
            for (int y = 0; y < arrayA.length-1; y++) {
                if (arrayA[y] > arrayA[y + 1]) {
                    int max = arrayA[y];
                    arrayA[y] = arrayA[y + 1];
                    arrayA[y + 1] = max;
                }
            }

        }
        System.out.print("排序之后为：" + "\t");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "、");
        }
    }
}
