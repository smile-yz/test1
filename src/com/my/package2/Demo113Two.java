package com.my.package2;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Demo113Two {
    public static void main(String[] args) {
        Demo113 stu1 = new Demo113();
        stu1.setName("哇咔咔");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("===================================");

        Demo113 stu2 = new Demo113("哇哈哈",22);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        System.out.println("===================================");

        stu2.setAge(28);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        System.out.println((int) (Math.random() * 100));

    }

}
