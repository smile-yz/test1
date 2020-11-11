/*
常量：在程序运行期间，固定不变的量
常量的分类：
1.字符串常量：范是用双引号引起来的部分，叫做字符串常量。例如："abc"、"Hello"、"123"
2.整数常量；直接写上的数字，没有小数点。例如：100、200、0、-250
3.浮点数常量：直接写上的数字，有小数点。例如：2.5、-3.14、0.0
4.字符常量：凡是用单引号引起来的单个字符，就叫做字符常量。例如：'A'、'b'、'9'、'中'
5.布尔常量：只有两种取值。true、false
6.空常量；null。代表没有任何数据。
 */
package com.my.package1;

public class Demo01Const {
    public static void main(String[] args) {
        //字符串常量
        System.out.println("ABC");
        System.out.println("");//字符串两个双引号中的内容为空
        System.out.println("XCV");
        //整数常量
        System.out.println(30);
        System.out.println(-30);
        //浮点数常量（小数）
        System.out.println(3.3);
        System.out.println(3.1415926);
        //字符常量
        System.out.println('1');
        System.out.println('A');
        System.out.println('a');
        //布尔常量
        System.out.println(true);
        System.out.println(false);
    }
}
