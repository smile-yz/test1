package com.my.game;

public class ArraySortVersion2 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{ 8, 7, 9, 10, 6, 5, 2, 1, 3 };
        printArray(arrayA);
        System.out.println();
        sort(arrayA);
        printArray(arrayA);
    }

    //排序并进行替换
    public static void sort(int[] sort) {
        for (int x = 0; x < sort.length; x++) {
            for (int y = 0; y < sort.length - 1; y++) {
                if ( sort[y] > sort[y + 1]) {
                    int num = sort[y];
                    sort[y] = sort[y + 1];
                    sort[y + 1] = num;
                }
            }
        }
    }

    //将数组输出
    public static void printArray(int[] printA) {
        System.out.print("排序之后的数组为：");
        for (int i = 0; i < printA.length; i++) {
            System.out.print(printA[i] + "、");
        }
    }

}
