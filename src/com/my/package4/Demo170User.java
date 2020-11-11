package com.my.package4;

public class Demo170User {
    private String name;//姓名
    private int money;//余额

    public  Demo170User() {
    }

    public Demo170User(String name,int money) {
        this.name = name;
        this.money = money;
    }
    //展示一下当前用户有多少余额
    public void show() {
        System.out.println("我叫：" + name + "，余额为：" + money);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }

}
