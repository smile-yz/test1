package com.my.package3;
import java.util.Scanner;

/*
题目：
键盘输入一个而字符串，并且统计其中各种字符出现次数
种类有：大写字母、小写字符、数字、其他

思路:
1.键盘输入：Scanner
2.键盘输入的字符串，那么String str = sc.next();
3.定义四个变量，分别代表四种字符各自的出现字数
4.需要对字符串检查  String-->char[]  方法：toCharArray()
5.遍历数组char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作
6.打印输出四个变量
 */
public class Demo142StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = sc.next(); //获取键盘输入的字符串

        int countUpper = 0;//大写
        int countlower = 0;//小写
        int countNumber = 0;//数字
        int countOther = 0;//其它字符

        char[] charArray = input.toCharArray();
        for (int i = 0;i < charArray.length;i++) {
            char ch = charArray[i];//当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countlower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有：" + countUpper);
        System.out.println("小写字母有：" + countlower);
        System.out.println("数字有：" + countNumber);
        System.out.println("其他有：" + countOther);
    }
}
