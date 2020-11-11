package com.my.package5;

public class Demo210Game {
    public static void main(String[] args) {
        Demo210Hero hero = new Demo210Hero();
        hero.setName("德玛");//设置英雄的名称

        //设置英雄技能
        //方法一
//        hero.setSkill(new Demo210SkillImpl());//使用单独定义的实现类
//        hero.attack();
        //方法二
        Demo210SkillImpl impl = new Demo210SkillImpl();
        hero.setSkill(impl);
        hero.attack();

        //方法三：使用匿名内部类

        Demo210Skill skill = new Demo210Skill() {
            @Override
            public void use() {
                System.out.println("大鸟");
            }
        };
        hero.setSkill(skill);
        hero.setName("艾希");
        hero.attack();

        //方法四：进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Demo210Skill() {
            @Override
            public void use() {
                System.out.println("Duang");
            }
        });
        hero.setName("石头人");
        hero.attack();
    }
}
