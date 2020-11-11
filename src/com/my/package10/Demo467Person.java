package com.my.package10;

public class Demo467Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Demo467Person() {

    }
    public Demo467Person(String name,int age) {
        this.name = name;
        this.age = age;
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

    /*@Override
    public String toString() {
        return "Demo467Person{name='" + name + "',age=" + age + "}";
    }*/

    @Override
    public String toString() {
        return "Demo467Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
    public void eat() {
        System.out.println("eat.....");
    }
    public void eat(String food) {
        System.out.println("eat..." + food);
    }

}
