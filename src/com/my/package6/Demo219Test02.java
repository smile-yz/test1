package com.my.package6;

public class Demo219Test02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        Demo219Student stu1 = new Demo219Student("古力娜扎",19);
        Demo219Student stu2 = new Demo219Student("古力娜扎",19);
        Demo219Student stu3 = new Demo219Student("马儿扎哈",33);
//        System.out.println(stu1.equals(stu2));//重写前的方法   false

        //重写后
        System.out.println(stu1.equals(stu2));//ture
        System.out.println(stu1.equals(stu3));//false
        System.out.println(stu1.equals(stu1));//ture
        System.out.println(stu1.equals(null));//false



    }
}
