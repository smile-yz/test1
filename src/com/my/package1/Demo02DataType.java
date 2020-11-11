/*
强制类型转换
    1.特点：代码需要进行特殊的格式处理，不能自动完成
    2.格式：范围小的类型，范围小的变量名 = （范围小的类型）原本范围大的数据；
 */
package com.my.package1;
/*
强制类型转换
    1.特点：代码需要进行特殊的格式处理，不能自动完成
    2.格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的数据;

注意事项：
    1.强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
    2.byte/short/char这三种类型都可以发生数学运算，例如加法“+”
    3.byte/short/char这三种类型在运算的时候，都会被首先提升称为int类型，然后再计算
    4.boolean类型不能发生数据类型转换
 */
public class Demo02DataType {
    public static void main(String[] args) {
        int num = (int)100L;
        System.out.println(num);
        //long强制转换为int类型
        int num2 = (int) 6000000000L;
        System.out.println(num2); //1705032704

        //double-->int 强制转换
        int num3 = (int) 3.5;
        System.out.println(num3);//3,不是四舍五入，所有小数位都会被舍弃掉

        char zifu1 = 'A';
        System.out.println(zifu1+1);//66,A被当作65处理
        //一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成为数字

        byte num4 = 40;
        byte num5 = 50;
        int result1 = num4 + num5;
        System.out.println(result1);//90

        short num6 = 60;
        //int result2 = num4 + num6;
        short result2 = (short) (num4 + num6);
        System.out.println(result2);

    }
}
