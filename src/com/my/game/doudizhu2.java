package com.my.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class doudizhu2 {
    public static void main(String[] args) {
        /**
         * 有序的斗地主
         * */
        //创建一个map集合，装牌的索引和牌
        HashMap<Integer,String> hashMap = new HashMap<>();
        //创建一个list，装牌的索引
        ArrayList<Integer> list = new ArrayList<>();
        //先把大王，小王放到集合中
        int a = 0;
        hashMap.put(a,"大王");
        list.add(a);
        a++;

        hashMap.put(a,"小王");
        list.add(a);
        a++;

        //创建两个集合，组合牌,并放入到map集合中
        List<Object> of = List.of("♠","♥","♣","♦");
        List<Object> of1 = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        for (Object o : of1) {
            for (Object o1 : of) {
                String pai = (String) o+o1;
                hashMap.put(a,pai);
                list.add(a);
                a++;
            }
        }
        /*System.out.println(list);*/
        //洗牌
        Collections.shuffle(list);

        //定义玩家集合
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> w1 = new ArrayList<>();
        ArrayList<Integer> w2 = new ArrayList<>();
        ArrayList<Integer> w3 = new ArrayList<>();

        //发牌
        for (int i = 0; i < list.size(); i++) {
            Integer in = list.get(i);
            if (i>=51){
                d.add(in);
            }else if (i % 3 ==0){
                w1.add(in);
            }else if (i % 3 ==1){
                w2.add(in);
            }else if (i % 3 ==2){
                w3.add(in);
            }
        }

        //给牌排序
        Collections.sort(w1);
        Collections.sort(w2);
        Collections.sort(w3);
        Collections.sort(d);


        //看牌 底牌牌
        System.out.print("底牌： ");
        for (Integer key : d) {
            String value = hashMap.get(key);
            System.out.print(value+"  ");
        }
        System.out.println();

        //看牌 玩家1的牌
        System.out.print("玩家1的牌： ");
        for (Integer key : w1) {
            String value = hashMap.get(key);
            System.out.print(value+"  ");
        }
        System.out.println();

        //看牌 玩家2的牌
        System.out.print("玩家2的牌： ");
        for (Integer key : w2) {
            String value = hashMap.get(key);
            System.out.print(value+"  ");
        }
        System.out.println();

        //看牌 玩家3的牌
        System.out.print("玩家3的牌： ");
        for (Integer key : w3) {
            String value = hashMap.get(key);
            System.out.print(value+"  ");
        }
        System.out.println();


    }

}

