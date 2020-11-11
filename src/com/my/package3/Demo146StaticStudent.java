package com.my.package3;

public class Demo146StaticStudent {
    public static void main(String[] args) {
        Demo144Student.room = "101教室";

        Demo144Student one = new Demo144Student("郭靖",20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Demo144Student.room);

        Demo144Student two = new Demo144Student("黄蓉",19);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Demo144Student.room);
    }
}
