package com.my.package10;
/*
定义一个子类
 */
public class Demo454Man extends Demo454Human {
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }
    //定义一个方法，参数传递Demo454Greetable接口
    public void method(Demo454Greetable g) {
        g.greet();
    }
    public void show() {
        //调用method方法，方法的参数Demo454Greetable是函数式接口，所以可以传递lambda表达式
        /*method(() -> {
            //创建父类对象
            Demo454Human h = new Demo454Human();
            h.sayHello();
        });*/
        //因为有字符类关系，所以存在的一个关键字super，代表父类，所以可以直接使用super调用父类的成员方法
        method(() -> {
            super.sayHello();
        });
        /*
        使用super引用类的成员方法
        super是已经存在的
        父类的成员方法sayHello也是已经存在的
        所以直接使用super引用父类的成员方法
         */
        method(super :: sayHello);
    }
    public static void main(String[] args) {
        new Demo454Man().show();
    }
}
