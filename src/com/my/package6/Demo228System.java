package com.my.package6;
import java.util.Arrays;
/*
java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或者系统级操作，在System类的API文档中，常用的方法有：
    public static long currentTimeMillis():返回毫秒为单位的当前时间
    public static void arraycopy(Object src, int srcPos, Object dest,int destPos, int length);
    将数组中指定的数据拷贝到另一个数组中。
    参数：
         src - 源数组
         srcPos - 原数组中起始位置
         dest - 目标数组
         destPos - 目标数组中的起始位置
         length - 要复制的数组元素的数量
 */
public class Demo228System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
        public static long currentTimeMillis():返回毫秒为单位的当前时间
        测试程序的效率
        练习：验证for循环打印数字1-9999所需要使用的时间（毫秒）

     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 1;i <= 10000;i++) {
            System.out.println(i);
        }
        long s1 = System.currentTimeMillis();

        System.out.println("程序共耗时：" + (s1 - s) + "毫秒");
    }

    /*
    public static void arraycopy(Object src, int srcPos, Object dest,int destPos, int length);
    将数组中指定的数据拷贝到另一个数组中。
    参数：
         src - 源数组
         srcPos - 原数组中起始位置
         dest - 目标数组
         destPos - 目标数组中的起始位置
         length - 要复制的数组元素的数量

     练习：
     将src数组中的前三个元素，复制到dest数组的前三个位置
     复制元素之前：src数组元素[1,2,3,4,5],dest数组元素[6,7,8,9,10]
     复制元素之后：src数组元素[1,2,3,4,5],dest数组元素[1,2,3,9,10]
     */
    private static void demo02() {
        //定义源数组
        int[] src = new int[] {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = new int[] {6, 7, 8, 9, 10};
        //复制前
        System.out.println("复制前源src数组：" + Arrays.toString(src));
        System.out.println("复制前目标dest数组：" + Arrays.toString(dest));
        System.out.println("========================");

        //使用System类的方法arraycopy
         System.arraycopy(src,2,dest,2,3);
         //复制后
        System.out.println("复制后源src数组：" + Arrays.toString(src));
        System.out.println("复制后目标dest数组：" + Arrays.toString(dest));

    }
}
