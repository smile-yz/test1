package com.my.package7;
import java.util.List;

/*
异常的注意事项
 */
public class Demo297Exception {
    public static void main(String[] args) {
        /*
        多个异常使用捕获又该如何处理？
        1.多个异常分别处理
        2.多个异常一次捕获，多次处理
        3.多个异常一次捕获一次处理
         */

        //1.多个异常分别处理
      /*  try{
            int[] arr = new int[] {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*//*

        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*/


//        2.多个异常一次捕获，多次处理
       /* try{
            int[] arr = new int[] {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*/


       //3.多个异常一次捕获一次处理
        try{
            int[] arr = new int[] {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("后续代码");


    }
}
