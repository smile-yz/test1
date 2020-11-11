package com.my.package6;
/*
哈希值：是一个十进制的整数，由系统随机给出，是一个逻辑地址
在Object类有一个方法，可以后去对象的哈希值
int hashCode() 返回该对象的哈希码值
public native int hashCode();
native:代表该方法调用的是本地系统的方法
 */
public class Demo265HashCode {
    public static void main(String[] args) {
        //Demo265Person类继承了Object类，所以可以使用Object类的hashCode方法
        Demo265Person p1 = new Demo265Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//284720968

        Demo265Person p2 = new Demo265Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//189568618

        System.out.println(p1);//com.my.package6.Demo265Person@10f87f48
        System.out.println(p2);//com.my.package6.Demo265Person@b4c966a
        System.out.println(p1 == p2);//false

        /*
        String类的哈希值
        String类重写Object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        System.out.println("重地".hashCode() == "通话".hashCode());//true


    }
}
