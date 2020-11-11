package com.my.package5;

public class Demo210Hero {
    private String name;//英雄的名称
    private Demo210Skill skill;//英雄的技能

    public Demo210Hero(){}
    public Demo210Hero(String name,Demo210Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("我是" + name + "，开始释放技能：");
        skill.use();//调用接口中的抽象方法
        System.out.println("释放技能完成。");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSkill(Demo210Skill skill) {
        this.skill = skill;
    }
    public Demo210Skill getSkill() {
        return skill;
    }
}
