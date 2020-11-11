package com.my.game;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class doudizhu {
    public static void main(String[] args) {
        //创建一个集合，用来装牌
        List<String> list = new ArrayList<>();
        //创建两个数组，用来装牌的花色和序号
        //牌的花色
        List<String> a = List.of("♠","♥","♣","♦");
        //String[] a = {"","","",""};
        //牌的序号
        List<String> b = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        // String[] b ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //将大王，小王放入到集合中
        list.add("大王");
        list.add("小王");
        //使用增强for循环组合牌
        for (String s : b) {
            for (String s1 : a) {

                //将牌装入到list集合中
                list.add(s1+s);
            }
        }

        // 洗牌  使用集合工具类Collections的方法shuffle打乱元素顺序
        Collections.shuffle(list);
        //定义玩家与底牌
        ArrayList<String> w1 = new ArrayList<>();
        ArrayList<String> w2 = new ArrayList<>();
        ArrayList<String> w3 = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        System.out.println(list.size());
        //发牌 遍历list集合，把牌发入到玩家集合中
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i>=51){
                d.add(s);
            }
            else if (i % 3  == 0){
                w1.add(s);
            }
            else if (i % 3 == 1){
                w2.add(s);
            }
            else if (i % 3 == 2){
                w3.add(s);
            }
        }

        //看牌

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(d);

    }
}
