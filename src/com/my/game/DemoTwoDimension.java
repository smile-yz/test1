package com.my.game;

public class DemoTwoDimension {
    public static void main(String[] args) {
        int[][] arrayA = new int[2][3];
        arrayA[0][0]=1;
        arrayA[0][1]=2;
        int arrayB[][] = new int[][]{
                {1,2,3},{4,5,6}
        };
        System.out.println(arrayA.length);
        System.out.println(arrayA[1].length);
        System.out.println(arrayA[0][0]);
        System.out.println("============================");

        System.out.println(arrayB[0]);
        System.out.println(arrayB.length);
        System.out.println(arrayB[1].length);
        System.out.println(arrayB[1][0]);
        System.out.println(arrayB[1][1]);
        System.out.println(arrayB[1][2]);
        System.out.println("============================");
        for (int x = 0; x < arrayB.length; x++) {
            for (int y = 0; y < arrayB[x].length; y++) {
                System.out.print(arrayB[x][y] + "\t");
            }
            System.out.println();
        }

    }
}
