package com.my.package2;

public class Demo92ArrayMin {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 25, 26, 30, 1000, 5, -20 };
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素，比max大，则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
        //谁最大，在留在max
        System.out.println("最小值：" + min);

    }
}
