package com.my.package6;
import java.util.Objects;

public class Demo268Person {
    private String name;
    private int age;
    public Demo268Person() {}
    public Demo268Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo268Person{name='" + name + "'" + ",age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo268Person person = (Demo268Person) o;
        return age == person.age && Objects.equals(name,person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
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
