package com.my.game;

public class ArraySortVersion3 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{ 8, 7, 9, 10, 6, 5, 2, 1, 3 };
        java.util.Arrays.sort(arrayA);
        printArray(arrayA);
    }
    public static void printArray(int[] printA) {
        for (int i = 0; i < printA.length; i++) {
            System.out.print(printA[i] + "、");
        }
    }
}
