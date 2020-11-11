package com.my.package2;
/*
使用方法的时候，注意事项：
1.方法应该定义在类当中，不能在方法当中再定义方法，不能嵌套
2.方法定义的前后顺序无所谓
3.方法定义之后不会执行，如果希望执行，一定要调用，单独调用、打印调用、赋值调用
4.如果方法有返回值，必须写上 “return 返回值” 不能不写
5.return后面的返回值数据，必须和方法的返回值类型对应起来
6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己（只是结束方法的执行而已）
7.对于void方法当中最后一行的return可以省略不写
8.一个方法当中可以有多个return语句，但必须保证同时只有一个会被执行,两个return不能连写

 */
public class Demo72MethodNotice {

    public static int getMax(int a,int b) {
        //方法一：
        /*int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }*/

        //方法二：
        /*int max = a > b ? a : b;
        return max;*/

        //方法三：
        if ( a > b) {
            return a;
        } else {
            return b;
        }

    }
}
