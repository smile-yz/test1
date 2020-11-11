package com.my.package10;

/*
定义一个创建Demo456Person对象的函数式接口
 */
@FunctionalInterface
public interface Demo456PersonBuilder {
    //定义一个方法，根据传递的姓名，创建Demo456Person对象返回
    public abstract Demo456Person builderperson(String name);
}
