package com.my.package8;
import java.util.Arrays;
import java.util.Comparator;

/*
Lambda表达式有参数有返回值练习
需求：
使用数组存储多个Demo340Person对象
对数组中的Demo340Person对象使用sort方法通过年龄进行升序排序
 */
public class Demo340Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Demo340Person对象
        Demo340Person[] arr = new Demo340Person[] {
            new Demo340Person("柳岩",19),
            new Demo340Person("迪丽热巴",18),
            new Demo340Person("古力娜扎",20),
            new Demo340Person("马尔扎哈",22),
        };

        //对数组中的Demo340Person对象使用sort方法通过年龄进行升序排序
        Arrays.sort(arr, new Comparator<Demo340Person>() {
            @Override
            public int compare(Demo340Person o1, Demo340Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //遍历数组
        for (Demo340Person p : arr) {
            System.out.println(p);
        }
        System.out.println("==============================");
        //使用Lambda表达，简化匿名内部类
        Arrays.sort(arr,(o1,o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Demo340Person p : arr) {
            System.out.println(p);
        }
        System.out.println("==============================");


        //使用Lambda简化版
        Arrays.sort(arr,(o1,o2) ->
           o1.getAge() - o2.getAge()
        );
        for (Demo340Person p : arr) {
            System.out.println(p);
        }
        System.out.println("==============================");
    }
}
