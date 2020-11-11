package com.my.package6;
/*
使用前提：
当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
使用格式：
定义方法时使用
修饰符  返回值类型 方法名（数据类型...变量名） {}
可变参数的原理: 底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
传递的参数可以是0个（不传递），1，2，3...多个

可变参数的注意事项：
1.一个方法的参数列表，只能有一个可变参数
2.如果方法的参数有多个，那么可变参数必须写在可变参数列表的末尾
public static void method(String a,int b,double c,int...d){}//正确
 */
public class Demo270VarArgs {
    public static void main(String[] args) {
        int i = add(1,2,3);
        System.out.println(i);
    }
    //定义一个方法，计算int整数的和
    public static int add(int...a) {
       // System.out.println(a);//[I@723279cf  底层其实就是一个数组
       // System.out.println(a.length);
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
