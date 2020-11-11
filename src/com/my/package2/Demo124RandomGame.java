package com.my.package2;
import java.util.Random;
import java.util.Scanner;
/*
题目：
用代码模拟猜数字小游戏

思路：
1.首先产生随机数字，并且一旦产生不再变化。用Random的nextInt方法
2.需要键盘输入，所以用到Scanner
3.获取键盘输入数字，，用Scanner当中的nextInt方法
4.已经得到的两个数字，判断（if）一下
如果太大，提示太大，并且重试；
如果太小，提示太小，并且重试；
如果猜中，游戏结束。
5.重试就是再来一次，循环次数不确定，用while(true)。
 */
public class Demo124RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//随机数1~100

        while (true) {
            System.out.print("请输入猜测数字：");
            int guessNum = sc.nextInt();//键盘输入数字
            if (randomNum == guessNum) {
                System.out.println("恭喜你猜对了！答案是：" + randomNum + "\n游戏结束.");
                break;
            } else if (randomNum > guessNum) {
                System.out.println("抱歉，你猜太小了！！请继续猜数，才正确结束游戏");
            } else {
                System.out.println("抱歉，你猜太大了！！请继续猜数，才正确结束游戏");
            }
        }

    }
}
