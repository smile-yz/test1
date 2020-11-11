package com.my.package1;
/*
自增运算符：++
自减运算符：--
基本含义：让一个变量涨一个数字1，或者让一个变量降一个数字1
使用格式：卸载变量名称之前或者写在变量名称之后，例如：++num , num++
使用方式：
    1.单独使用：不和其他任何操作混合使用，自己独立成为一个步骤
    2.混合使用：和其他操作混合使用，例如与赋值混合，或者与打印操作混合等
使用区别：
    1.在单独使用时，前++和后++没有任何区别     ++num与num++一样
    2.混合使用时：
        A.如果是【前++】，那么变量【立马+1】然后拿着结果进行使用 【先加后用】
        B.如果是【后++】，那么首先使用变量本来的值，【然后再让变量+1】   【先用后加】
 */
public class Demo06perator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        ++num1;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        System.out.println("===============================================");

        int num2 = 20;
        System.out.println(++num2);
        System.out.println(num2++);
        System.out.println(num2);


        int num4 = 40;
        int result1 = --num4;
        System.out.println(result1);//39

        int result2 = num4--;
        System.out.println(result1);//39
        System.out.println(num4);//38
        System.out.println("=========================");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3);//31
        System.out.println(x);//11
        System.out.println(y);//19


    }
}
