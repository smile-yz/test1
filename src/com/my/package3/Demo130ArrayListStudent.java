package com.my.package3;
import java.util.ArrayList;
/*
题目：
自定义4个学生对象，添加到集合，并遍历

思路：
1.自定义Student学生类，四个部分
2.创建一个集合，用来存储学生对象。泛型<Student>
3.根据类，创建4个学生对象
5.遍历集合：for、size、get
 */
public class Demo130ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Demo130Student> list = new ArrayList<>();
        Demo130Student one = new Demo130Student("洪七公",20);
        Demo130Student two = new Demo130Student("欧阳锋",21);
        Demo130Student three = new Demo130Student("黄药师",22);
        Demo130Student four = new Demo130Student("段智兴",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0;i < list.size();i++) {
            Demo130Student stu = list.get(i);

            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
    }
}
