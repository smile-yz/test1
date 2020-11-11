package com.my.package1;
/*
定义一个方法的格式：
public static void 方法名称() {
    方法体
}
方法名称的命名规则和变量一样，使用小驼峰。
方法体：也就是大括号当中可以包含任意条语句

注意事项：
1.方法定义的先后顺序无所谓
2.方法的定义不能产生嵌套包含关系
3.方法定义好了之后不会执行的，如果想执行，一定要进行方法的【调用】

如何调用方法，格式：
方法名称();
 */
public class Demo11Method {
    public static void main (String[] args) {
        farmer();//调用农民的方法
        seller();//调用商贩的方法
        cook();//调用厨子的方法
        me();//调用me的方法
    }
    public static void farmer() {
        System.out.println("农民");
    }
    public static void seller() {
        System.out.println("商贩");
    }
    public static void cook() {
        System.out.println("厨师");
    }
    public static void me() {
        System.out.println("吃");
    }
}
