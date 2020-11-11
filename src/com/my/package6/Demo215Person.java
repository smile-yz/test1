package com.my.package6;

public class Demo215Person {
    private String name;
    private int age;
    public Demo215Person(){}
    public Demo215Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    /*
    直接打印对象的地址值没有意义，需要重写object类的toString方法
    打印对象的属性（name,age）
     */

    //方法一：
  /*  @Override
    public String toString() {
        //return "abc";
        //return this.name;
        return "Demo215Person{name=" + name + ",age=" + age + "}";
    }*/

  //方法二：
//    @Override
//    public String toString() {
//        return "Demo215Person{" + "name='" + name + '\'' + ",age=" + age + '}';
//    }

    @Override
    public boolean equals(Object obj) {
        //判断传递参数obj是null，直接返回false，提高程序效率
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj instanceof Demo215Person) {
            Demo215Person p = (Demo215Person) obj;
            //比较两个对象的属性；一个是调用方法的this（p1）,一个就是p(obj=p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;
    }

    public void setName (String name) {
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
