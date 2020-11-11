package com.my.package4;
import java.util.ArrayList;

public class Demo170MainRedPacket {
    public static void main(String[] args) {
        Demo170Manager manager = new Demo170Manager("群主",100);
        Demo170Member one = new Demo170Member("成员A",0);
        Demo170Member two = new Demo170Member("成员B",0);
        Demo170Member three = new Demo170Member ("成员C",0);

        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("=========================================================");

        //群主发20红包，分成3分
        ArrayList<Integer> redList = manager.send(20,3);

        //三个普通成员红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();//100-20=80
        one.show();
        two.show();
        three.show();
    }
}
