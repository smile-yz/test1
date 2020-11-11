package com.my.package2;

import java.sql.SQLOutput;

/*
题目要求；
定义一个方法，判断两个数字是否相同
 */
public class Demo69MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }
    /*
    三要素:
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a,int b

     */
    public static boolean isSame (int a,int b) {
        //方法一：
        /*boolean same;
        *//*if (a == b) {
            same = true;
        } else {
            same = false;
        }*/

        //方法二：
        /*boolean same = a == b ? true : false;
         return same;
         */

        //方法三：
        /*boolean same = a == b;
        return same;
         */

        //方法四：
        return a == b;
    }
}
