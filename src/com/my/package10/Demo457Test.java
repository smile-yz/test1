package com.my.package10;
/*
数组的构造器引用
 */
public class Demo457Test {
    /*
    定义方法，参数传递创建数组的长度和Demo457ArrayBuilder接口
    方法内部根据传递长度使用Demo457ArrayBuilder中的创建数组并返回
     */
    public static int[] createArray(int length,Demo457ArrayBuilder ab) {
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        //调用createArray方法，传递数组的长度和lambda表达式
        int[] arr1 = createArray(10,(int len) -> {
           return new int[len];
        });
        System.out.println(arr1.length);
        /*
        使用方法引用优化lambda表达式
        已知创建的就是int[]数组
        数组的长度也是已知的
        就可以使用方法引用
        int[]引用new，根据参数传递长度来创建数组
         */
        int[] arr2 = createArray(10,int[]::new);
        System.out.println(arr2.length);
    }
}
