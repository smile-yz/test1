package com.my.package2;

public class Demo112StudentTwo {
    public static void main(String[] args) {
        Demo112Student stu1 = new Demo112Student();
        System.out.println("==================================");
        Demo112Student stu2 = new Demo112Student("赵丽颖",20);
        System.out.println("我是" + stu2.getName() + "，我今年" + stu2.getAge());
        stu2.setAge(21);
        System.out.println("我是" + stu2.getName() + "，我今年" + stu2.getAge());
    }
}
