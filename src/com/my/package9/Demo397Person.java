package com.my.package9;

import java.io.Serializable;

/*
序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
 */
public class Demo397Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
//    private transient int age;//瞬态关键字，不能被序列化
    public int age;
    public Demo397Person() {}
    public Demo397Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Demo397Person{" + "name='" + name + "',age=" + age + "}";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
