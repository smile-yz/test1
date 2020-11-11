package com.my.package5;

public class Demo204InnerClass {
    public static void main(String[] args) {
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Demo204Outer.Inner obj = new Demo204Outer().new Inner();
        obj.methodInner();
    }
}
