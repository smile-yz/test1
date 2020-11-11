package com.my.package2;

public class Demo105PhoneParam {
    public static void main(String[] args) {
        Demo101Phone one = new Demo101Phone();
        one.brand = "苹果";
        one.price = 8033.0;
        one.color =  "土豪金";
        method(one);

    }
    public static void method(Demo101Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
