/*
使用变量的注意事项：
1.如果创建多个变量，那么变量之间的名称不可以重复。
2.
 */
/*
1.如果创建多个变量，那么变量之间的名称不可重复
2.对于float和long类型来说，字母后缀F和L不要丢掉
3.如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
4.没有进行赋值的变量，不能直接使用，一定要赋值之后，才能使用
 */
package com.my.package1;
/*
1.如果创建多个变量，那么变量之间的名称不可重复
2.对于float和long类型来说，字母后缀F和L不要丢掉
3.如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
4.没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用
5.变量使用不能超过作用域的范围
【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
        //int num1 = 20; //变量名重复，错误！！！
        int num2 = 20;
        int num3;
        num3 = 30;
        int num4;  //定义了一个变量，但是没有进行赋值
        //System.out.println(num4); //直接使用打印输出就是错误的

        int num5 = 500;
        System.out.println(num5);

        //同时创建三个全都是int类型的变量
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        //同时创建三个Int变量，并同时赋值
        int x = 100, y = 200, z = 300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
