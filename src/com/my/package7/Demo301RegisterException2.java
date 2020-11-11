package com.my.package7;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/*
模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
分析：
    1.使用数组保存已经注册过的用户名
    2.使用Scanner获取用户名
    3.定义一个方法，对用户输入的注册名进行判断
        遍历存储已经注册过用户名的数组，获取每一个用户名
        使用获取到的用户名和用户输入的用户名比较
        true:
            用户名已经存在，抛出RegisterException异常，告知用户“亲，该用户已经被注册”;
        false:
            继续遍历比较
        若循环结束，没有找到重复的用户名，提示用户“恭喜您，注册成功”；
 */
public class Demo301RegisterException2 {
    //        1.使用数组保存已经注册过的用户名
    static String[] usernames = new String[]{"张山", "李思", "王伍"};

    public static void main(String[] args) throws Demo300RegisterException {
//        2.使用Scanner获取用户名
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);


    }

    //     3.定义一个方法，对用户输入的注册名进行判断
    public static void checkUsername(String username) throws Demo300RegisterException {
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            if (name.equals(username)) {
                //true:用户名已经存在，抛出RegisterException异常，告知用户“亲，该用户已经被注册”;
                throw new Demo300RegisterException("亲，该用户已经被注册");
            }
//        若循环结束，没有找到重复的用户名，提示用户“恭喜您，注册成功”；
            System.out.println("恭喜您，注册成功");


        }
    }
}
