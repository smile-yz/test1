package com.my.package4;

public class Demo160Zi extends Demo160Fu {
    public Demo160Zi() {
//        super();//在调用父类无参构造方法；隐含的，默认是不带参数的，不写则默认赠送super(),调用无参构造方法
//        super(20);//调用父类重载的构造方法，调用有参数的
        System.out.println("子类构造方法！");
    }
}
