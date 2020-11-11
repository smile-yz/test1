package com.my.package2;
/*
定义一个类，用来模拟“手机”事务
属性：品牌、价格、颜色
行为：打电话、发短信

对应到类当中：
成员变量：
String brand; //品牌
double price; //价格
String color; //颜色

成员方法：
public void all(String who) {} //打电话
public void sendMessage() {} //群发短信
 */
public class Demo101Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
        System.out.println("品牌是：" + "\t" + brand + "\n" + "价格是："+ "\t" + price + "\n" + "颜色是：" + "\t" + color);
    }
}
