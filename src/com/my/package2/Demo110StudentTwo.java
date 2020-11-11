package com.my.package2;

public class Demo110StudentTwo {
    public static void main(String[] args) {
        Demo110Student stu = new Demo110Student();

        stu.setName("鹿晗");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们？：" + stu.isMale());
    }
}
