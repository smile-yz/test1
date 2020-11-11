package com.my.package10;
import java.util.ArrayList;
import java.util.List;
/*

 */
public class Demo437List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("古力娜");
        list.add("古尔扎哈");
        list.add("迪丽热巴");
        list.add("赵丽颖");
        list.add("古泽瑞尔");

        //对list集合中的元素进行过滤，只要以古开头的元素，存储到集合中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("古")) {
                listA.add(s);
            }
        }
        //对listA集合进行过滤，只要姓名长度为3的人，存储到新的集合中
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3) {
                listB.add(s);
            }
        }
        //遍历listB集合
        for(String s : listB) {
            System.out.println(s);
        }
    }
}
