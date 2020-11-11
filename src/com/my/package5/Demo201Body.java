package com.my.package5;

public class Demo201Body { //外部类

    public class Heart { //成员内部类
        //内部类的方法
        public void beat(String name) {
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println("我叫：" + name);
        }
    }

    //外部类的成员变量
    private String name;

    //外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
//        Heart  heart = new Heart();
        new Heart().beat("哇哈哈");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
