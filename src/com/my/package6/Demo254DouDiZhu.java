package com.my.package6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
斗地主案例：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class Demo254DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //使用ArrayList集合存储54张牌，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储花色，另一个数字
        String[] colors = new String[] {"♠", "♥", "♣", "♦"};
        String[] numbers = new String[] {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大王小王存储poker中
        poker.add("大王");
        poker.add("小王");

        //循环嵌套遍历，两个数组，组合52张牌
        for (String number : numbers) {
            for (String color : colors) {
//                System.out.println(color + number);
                //把组装好的牌存储到poker集合中
                poker.add(color + number);
            }
        }
//        System.out.println(poker);

        //2.洗牌
        //使用集合的工具类Collection中的方法
        //static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
//        System.out.println(poker);

        //3.发牌
        //定义四个集合，存储玩家牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历poker，获取每一张牌
        //使用poker集合的索引%3给三个玩家轮流发牌
        //剩余三张牌给底牌
        //注意：先判断底牌（i>=51）,不然就发没有了
        for (int i = 0;i < poker.size();i++) {
            //每次获得一张牌
            String p = poker.get(i);
            //把索引51 52 53的牌放入底牌中
            //if (i >= 51) {
            if (i > poker.size()-4) {
                dipai.add(p);
            } else if (i%3 == 0){
                //给玩家1发牌
                player01.add(p);
            } else if (i%3 == 1) {
                //给玩家2发牌
                player02.add(p);
            } else if (i%3 == 2) {
                //给玩家3发牌
                player03.add(p);
            }
        }
        //4.看牌
//        System.out.println("=======================");
//        System.out.println("古力娜扎：" + player01);
//        System.out.println("马尔扎哈：" + player02);
//        System.out.println("迪丽热巴：" + player03);
//        System.out.println("底牌" + dipai);


        ArrayList<String> dizhu = new ArrayList<>();
        dizhu.add("player01");
        dizhu.add("player02");
        dizhu.add("player03");

        Random r = new Random();
        int num = r.nextInt(3);
        String dizhu1 = dizhu.get(num);
        //System.out.println(dizhu1);

        if (dizhu1 == "player01") {
            name(dipai,player01);
            System.out.println("古力娜扎（地主）：" + player01);
            System.out.println("马尔扎哈：" + player02);
            System.out.println("迪丽热巴：" + player03);
            System.out.println("底牌" + dipai);
        } else if (dizhu1 == "player02") {
            name(dipai,player02);
            System.out.println("古力娜扎：" + player01);
            System.out.println("马尔扎哈（地主）：" + player02);
            System.out.println("迪丽热巴：" + player03);
            System.out.println("底牌" + dipai);
        } else if (dizhu1 == "player03") {
            name(dipai,player03);
            System.out.println("古力娜扎：" + player01);
            System.out.println("马尔扎哈：" + player02);
            System.out.println("迪丽热巴（地主）：" + player03);
            System.out.println("底牌" + dipai);
        }


    }
    public static void name(ArrayList<String> list,ArrayList<String> name) {
        for (int i = 0;i < list.size();i++) {
            String pai = list.get(i);
            name.add(pai);
        }
        //System.out.println(name);

    }
}
