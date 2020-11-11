package com.my.package7;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/*
斗地主综合案例：有序版本
1.准备牌
2.洗牌
3.发牌
4.排序
5.看牌
 */
public class Demo287DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠","♥","♣","♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大王小王放入到Map集合中
        //定义牌的索引
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历两个集合，组装52张牌，存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
//      System.out.println(poker);
//        System.out.println(pokerIndex);
        //2.洗牌
        //使用Collections中的shuffle（List）方法
        Collections.shuffle(pokerIndex);

        //3.发牌
        //定义四个集合存储三个玩家牌的索引和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历存储牌索引的List集合，获取每个牌的索引
        for (int i = 0;i < pokerIndex.size();i++) {
            Integer in = pokerIndex.get(i);
            //先判断是不是给底牌的，不然直接就发没有了
            if (i >= 51) {
                //是，那么就发给底牌
                dipai.add(in);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(in);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(in);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(in);
            }
        }
        //4.排序
        //Collections中方法sort(List)
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);

        //5.看牌
        lookPoker("古力娜扎",poker,player01);
        lookPoker("马尔扎哈",poker,player02);
        lookPoker("迪丽热巴",poker,player03);
        lookPoker("底牌",poker,dipai);
    }

    /*
    定义一个看牌的方法，提高代码复用性
    参数： String name:玩家名称
           HashMap<Integer,String> poker：存储牌的poker集合
           ArrayList<Integer> list:存储玩家和底牌的List集合
     查表法：
     遍历玩家或者底牌集合，获取牌的索引
     使用牌的索引，去Map集合中，找到对应的牌

    */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer>list) {
        //输出玩家名称，不换行
        System.out.print(name + ": ");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();//打印完每一玩家的牌换行
    }
}
