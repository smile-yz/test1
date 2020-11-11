package com.my.package2;

public class Demo101PhoneOne {
    public static void main(String[] args) {
        //1.导包，在同一个包中，省略
        //2.创建  类名称 对象名 = new 类名称();
        Demo101Phone one = new Demo101Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("=========================");

        one.brand = "华为";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);//华为
        System.out.println(one.price);//8388.0
        System.out.println(one.color);//黑色
        System.out.println("=========================");

        one.call("乔布斯");
        one.sendMessage();
    }
}
