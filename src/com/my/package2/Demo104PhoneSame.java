package com.my.package2;

public class Demo104PhoneSame {
    public static void main(String[] args) {
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
        System.out.println("=========================");
        System.out.println("=========================");


        Demo101Phone two = one;
        System.out.println(two.brand);//null
        System.out.println(two.price);//0.0
        System.out.println(two.color);//null
        System.out.println("=========================");

        two.brand = "华为";
        two.price = 8388.0;
        two.color = "黑色";
        System.out.println(two.brand);//华为
        System.out.println(two.price);//8388.0
        System.out.println(two.color);//黑色
        System.out.println("=========================");

        two.call("乔布斯");
        two.sendMessage();
    }
}
