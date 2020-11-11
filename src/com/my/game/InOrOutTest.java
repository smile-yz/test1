package com.my.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InOrOutTest {
    public static void main(String[] args) {
        Scanner s = null;
        s = new Scanner(System.in); //控制台输入的一种方法
        String str = "start" ;
        int i = 0;
        List list = new ArrayList();
        while(!str.equals("bye")){  //输入bye,则停止数据是输入。
            str = s.nextLine();
            list.add(i,str);
            i++;
        }
        Iterator it = list.iterator();
        while(it.hasNext()){    //将输入的数据打印出来
            System.out.println(it.next());
        }
        s.close();
    }
}

