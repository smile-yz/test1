package com.my.game;

/*
数组拷贝：
语法：System.arraycopy(原数组名称、原数组拷贝开始索引，目标数组名称，目标数组复制开始索引长度）
int[] dataA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
int[] dataB = new int[] { 11, 22, 33, 44, 55, 66, 77, 88 };

 */
public class Demo3ArrayCopy {
    public static void main(String[] args) {
        int[] dataA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] dataB = new int[] { 11, 22, 33, 44, 55, 66, 77, 88 };
        System.arraycopy(dataA,4,dataB,2,3);
        printArray(dataB);
        System.out.println("=============================================");
        int[] arrayA = array();
        System.out.print("排序前的数组：");
        printArray(arrayA);
        arraySort(arrayA);
        System.out.print("排序后的数组：");
        printArray(arrayA);
        System.out.println("========================");
        Multiplication();
    }
    public static void printArray(int[] printArr) {
        for (int i = 0; i < printArr.length; i++) {
            System.out.print(printArr[i] + "、");
        }
        System.out.println();
    }


    public static int[] array() {
        return  new int[] { 9, 8, 7, 6, 4, 5, 3, 2, 1 };
    }
    public static void arraySort(int[] arrayB) {
        for (int x = 0; x < arrayB.length; x++) {
            for (int y = 0; y < arrayB.length - 1; y++) {
                if ( arrayB[y] >arrayB[ y + 1 ]) {
                    int max = arrayB[y];
                    arrayB[y] = arrayB[ y + 1 ];
                    arrayB[y + 1] = max;
                }
            }
        }
    }

    public static void Multiplication() {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y <= x; y++) {
                int result = x * y;
                System.out.print(x + "×" + y + "=" + result + "\t");
            }
            System.out.println();
        }
    }
}
