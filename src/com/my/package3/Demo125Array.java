package com.my.package3;
/*
题目：
定义一个数组，用来存储3个Person对象

数组有一个缺点，一旦创建，程序运行期间长度不可发生改变
 */
public class Demo125Array {
    public static void main(String[] args) {
        //首先创建一个数组长度为3，里面存放Person类型的对象
        Demo125Person[] array = new Demo125Person[3];
        Demo125Person one = new Demo125Person("迪丽热巴",18);
        Demo125Person two = new Demo125Person("古力娜扎",28);
        Demo125Person three = new Demo125Person("马儿扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

       // Demo125Person array1 = array[0];
        System.out.println(array[1].getName()); //古力娜扎

    }
}
