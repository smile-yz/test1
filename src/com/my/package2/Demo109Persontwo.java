package com.my.package2;

public class Demo109Persontwo {
    public static void main(String[] args) {
        Demo109Person person = new Demo109Person();
        person.show();

        person.name = "哇哈哈";
//        person.age = 1; //直接访问private内容，错误写法
        person.setAge(20);
        person.show();
        person.setAge(101);

    }

}
