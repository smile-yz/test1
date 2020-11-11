package com.my.package6;
import java.util.Objects;
/*
Objects类的equals方法：对两个对象进行比较，防止空指针异常
 */
public class Demo215Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        String s3 = "AAA";
        boolean a = s2.equals(s3);
        System.out.println(a);
        boolean b = s2.equalsIgnoreCase(s3);
        System.out.println(b);

        boolean c = Objects.equals(s1,s2);
        System.out.println(c);
        boolean d = Objects.equals(s2,s3);
        System.out.println(d);
    }
}
