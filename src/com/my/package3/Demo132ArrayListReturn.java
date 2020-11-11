package com.my.package3;
import java.util.Random;
import java.util.ArrayList;
/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义的方法来实现筛选

分析：
1.需要创建一个集合，用来存储int数字，<Integer>
2.随机数字就用Random nextInt
3.循环20次，把随机数字放入大集合 for循环 add方法
4.定义一个方法，用来筛选
筛选：根据大集合，筛选符合要求的元素，得到小集合
三要素：
返回值类型：ArrayList小集合（里面元素个数不确定—）
方法名称 getSmallList
参数列表：ArrayList大集合（装着20个随机数字）
5.判断（if）是偶数：num % 2 == 0
6.如果是偶数放入小集合当中，否则不放
 */
public class Demo132ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;//1~100
            bigList.add(num);
        }
        ArrayList<Integer>  smallList = getSmallList(bigList);
        System.out.println(smallList);
        System.out.println("偶数一共多少个：" + smallList.size());
    }
    //这个方法接受大集合参数，返回小集合参数
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //创建一个小集合用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0;i < bigList.size();i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
