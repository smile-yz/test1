package com.my.package8;
/*
Lambda表达式有参数有返回值得练习
需求:
给定一个计算器calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
使用Lamdba得标准格式调用invokeCalc方法，完成120和130得相加计算
 */
public class Demo341Calculator2 {
    public static void main(String[] args) {
        invokeCalc(120,130,new Demo341Calculator() {
            @Override
            public int calc(int a,int b) {
                return a + b;
            }
        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(120,130,(int a,int b) -> {
            return a + b;
        });

        //使用Lambda简化版
        invokeCalc(120,130,(int a,int b) ->
            a + b
        );
    }

    public static void invokeCalc(int a,int b,Demo341Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
