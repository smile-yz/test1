package com.my.package7;

public class Demo272Person implements Comparable<Demo272Person> {
    private String name;
    private int age;
    public Demo272Person(){}
    public Demo272Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo272Person{" + "name='" + name + "'" + ",age=" + age + "}";
    }

    @Override
    public int compareTo(Demo272Person o) {
//        return 0;
        //自定义比较规则
        return this.getAge() - o.getAge();//升序排序
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
