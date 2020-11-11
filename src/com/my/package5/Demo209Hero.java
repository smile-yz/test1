package com.my.package5;

public class Demo209Hero {
    private String name;//英雄名字
    private int age; //年龄
    private Demo209Weapon weapon;//武器

    public Demo209Hero() {

    }
    public Demo209Hero(String name,int age,Demo209Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("年龄为：" + age + "的" + name + "用" + weapon.getCode() + "攻击敌方");
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

    public void setWeapon(Demo209Weapon weapon) {
        this.weapon = weapon;
    }
    public Demo209Weapon getWeapon() {
        return weapon;
    }
}
