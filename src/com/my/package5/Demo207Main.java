package com.my.package5;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式:
接口名称 对象名称 = new 接口名称() {
    //覆盖重写所有抽象方法
};

对格式“new 接口名称() {....}”进行解析:
1.new代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{。。。}这才是匿名内部类的内容
另外还要注意几点问题：
1.匿名内部类在创建对象的时候，只能使用唯一一次
2.如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。

 */
public class Demo207Main {
    public static void main(String[] args) {
//        Demo207MyInterfaceImpl impl = new Demo207MyInterfaceImpl();
//        impl.method();
//        Demo207MyInterface boj = new Demo207MyInterfaceImpl();
//        boj.method();

        //使用匿名内部类
        Demo207MyInterface obj = new Demo207MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法111");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了方法222");
            }
        };
        obj.method();
        obj.method2();
    }
}
