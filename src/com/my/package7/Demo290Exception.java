package com.my.package7;
/*
异常产生过程解析，以及如何处理异常
 */
public class Demo290Exception {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        int e = getElement(arr,3);
        System.out.println(e);
    }

    /*
    定义一个方法，获取数组指定索引处的元素
    参数：
        int[] arr
        int index
     */
    public static int getElement(int[] arr,int index) {
        int ele = arr[index];
        return ele;
    }
}
