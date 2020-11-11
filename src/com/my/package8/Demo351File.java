package com.my.package8;
/*
使用前提：当使用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
注意事项：递归一定要有条件限定，保证递归能够停止，否则会发生栈内存溢出
         在递归中虽然由限定条件，但是递归次数不能太多，否则也会发生栈内存溢出
 */
public class Demo351File {
    public static void main(String[] args) {
        //a();
        b(1);
    }
    public static void b(int i) {
        System.out.println(i);
        if(i == 30000) {
            return;
        }
        b(++i);
    }
    public static void a() {
        System.out.println("a方法！");
        a();
    }
}
