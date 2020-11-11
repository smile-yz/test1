package com.my.package1;
/*
continue
一旦执行，立刻跳过当前次循环剩余内容，马上开始下一次循环
 */
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4){
                continue;
            }
            System.out.println("Hello!!!" + i);
        }
    }
}
