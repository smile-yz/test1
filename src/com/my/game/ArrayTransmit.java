package com.my.game;

public class ArrayTransmit {
    public static void main(String[] args) {
        int[] data = new int[]{ 1, 2, 3 };
        change(data);
        System.out.println(data);
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + "\t");
        }
    }
    public static void change(int[] temp) {
        System.out.println(temp);
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= 2;
        }
    }
}
