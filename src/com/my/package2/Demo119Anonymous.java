package com.my.package2;
/*
创建对象的标准格式：
类名称  对象名 = new 类名称();

匿名对象就是右边的对象，没有左边的名字和赋值运算符
new 类名称();
注意事项：匿名对象智能使用唯一的一次，下次再用不得不再创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象
 */
public class Demo119Anonymous {
    public static void main(String[] args) {
        Demo119Person one = new Demo119Person();
        one.name = "哇哈哈";
        one.showName();
        System.out.println("================================");

        //匿名对象
        new Demo119Person().name = "嘻嘻嘻";
        new Demo119Person().showName();  //null
    }
}
