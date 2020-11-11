package com.my.package5;

public class Demo209Main {
    public static void main(String[] args) {
        //创建一个角色
        Demo209Hero hero = new Demo209Hero();
        hero.setName("寒冰");
        hero.setAge(20);

        //创建一个武器对象
        Demo209Weapon weapon = new Demo209Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();
    }
}
