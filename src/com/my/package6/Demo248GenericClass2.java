package com.my.package6;

public class Demo248GenericClass2 {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        Demo248GenericClass gc = new Demo248GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建一个genericClass对象，泛型使用Integer
        Demo248GenericClass<Integer> gc2 = new Demo248GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建一个genericClass对象，泛型使用String
        Demo248GenericClass<String> gc3 = new Demo248GenericClass<>();
        gc3.setName("Stirng类型");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
