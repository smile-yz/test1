package com.my.package7;

public class Demo306Person {
    private String name;

    public void run() {
        //定义一个循环执行20次
        for (int i = 0;i < 20;i++) {
            System.out.println(name + i);
        }
    }

    public Demo306Person() {}
    public Demo306Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
