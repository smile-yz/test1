package com.my.package10;
/*
类的构造器引用（构造方法引用）
 */
public class Demo456Test {
    //定义一个方法，参数传递姓名和Demo456PersonBuilder接口，方法中通过姓名创建Demo456Person对象
    public static void printName(String name,Demo456PersonBuilder pb) {
        Demo456Person person = pb.builderperson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法，方法的参数Demo456PersonBuilder接口是一个函数式接口，可以传递Lambda
        printName("迪丽热巴",(String name) -> {
            return new Demo456Person(name);
        });

        /*
        使用方法引用优化Lambda表达式
        构造方法new Demo456Person(String name) 已知
        创建对象已知new
        就可以使用Demo456Person引用new创建对象
         */
        printName("古力娜扎",Demo456Person::new);
    }
}
