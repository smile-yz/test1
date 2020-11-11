package com.my.package3;

public class Demo144Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; //学号计数器
    public Demo144Student() {
    }
    public Demo144Student(String name,int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
