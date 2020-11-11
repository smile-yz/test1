package com.my.package4;
import java.util.ArrayList;
public class Demo170Manager extends Demo170User{
    public Demo170Manager() {
    }
    public Demo170Manager(String name,int money) {
       super(name,money);
    }

    public ArrayList<Integer> send(int totalMoney,int count) {
        //首先需要一个集合，用来存储若干个红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //查看群主当前余额
        int leftMoney = super.getMoney();//群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，重新设置余额，重新返回到user类中
        super.setMoney(leftMoney - totalMoney);

        //发红包，需平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//取余
        //剩下的零头包在最后一个红包当中
        //下面把这个红包一个一个放到集合当中
        for(int i = 0;i < count - 1;i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}

