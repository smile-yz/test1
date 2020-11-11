package com.my.package6;
/*
测试含有泛型的方法
 */
public class Demo249GenericText {
    public static void main(String[] args) {
        //创建测试类对象
        Demo249GenericMethod gm = new Demo249GenericMethod();
        //调用含有泛型的方法method01
        gm.method01(10);
        gm.method01("古力娜扎");
        gm.method01(true);

        //使用含有泛型的静态方法
        Demo249GenericMethod.method02(123);
        Demo249GenericMethod.method02("马尔扎哈");
    }
}
