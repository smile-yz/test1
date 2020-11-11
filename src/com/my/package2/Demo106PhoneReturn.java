package com.my.package2;

public class Demo106PhoneReturn {
    public static void main(String[] args) {
        Demo101Phone two = getPhone();
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//9000.0
        System.out.println(two.color);//磨砂黑
    }
    public static Demo101Phone getPhone() {
        Demo101Phone one = new Demo101Phone();
        one.brand = "苹果";
        one.price = 9000.0;
        one.color = "磨砂黑";
        return one;
    }
}
