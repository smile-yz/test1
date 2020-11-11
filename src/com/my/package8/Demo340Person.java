package com.my.package8;

public class Demo340Person {
    private String name;
    private int age;
    public Demo340Person() {

    }
    public Demo340Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo340Person{" + "name='" + name + ",age=" + age + "}";
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
