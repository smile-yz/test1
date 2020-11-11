package com.my.package6;

public class Demo219Student {
    private String name;
    private int age;
    public Demo219Student() {

    }
    public Demo219Student(String name,int age) {
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
    @Override
    public String toString() {
        return "Demo219Student{" + "name='" + name + "\'" + "，age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof Demo219Student) {
            Demo219Student stu = (Demo219Student)obj;
            return this.name.equals(stu.name) && this.age == stu.age;
        }
        return false;
    }
}
