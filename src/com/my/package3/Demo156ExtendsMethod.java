package com.my.package3;
/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
创建的对象是谁，就优先用谁，如果没有就向上找。

注意事项:
无论是成员方法还是成员变量，若没有就向上找，绝对不会向下找

重写（override）
概念：在继承关系中，方法的名称一样，参数列表也一样
重写（override）：方法名称一样，参数列表【也一样】覆盖、覆写
重载（overload）：方法名称一样，参数列表【不一样】

方法的覆盖重写特点：创建的是子类对象，则优先使用子类方法
 */
public class Demo156ExtendsMethod {
    public static void main(String[] args) {
        Demo156Zi zi = new Demo156Zi();
        zi.methodZi();
        zi.methodFu();
        //创建的是new子类对象，所以优先使用子类方法
        zi.method();
    }
}
