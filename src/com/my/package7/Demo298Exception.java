package com.my.package7;
/*
如果finally有return语句，永远返回finally中的结果，避免该情况,不要再finally中写return语句
 */
public class Demo298Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }
    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }
}
