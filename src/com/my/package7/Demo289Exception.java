package com.my.package7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
java.util.Throwable:类是Java语言中所有错误或异常的超类
Exception:编译期异常
RuntimeException: 运行期异常
异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行

Error:错误
相当于程序得了无法治愈的毛病，必须修改源代码，程序才能继续执行
 */
public class Demo289Exception {
    public static void main(String[] args) {
        //Exception:编译期异常
/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-99");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //RuntimeException: 运行期异常
       /* int[] arr = new int[] {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            //异常处理逻辑
            System.out.println(e);
        }*/

        //Error:错误
        //OutOfMemoryError: Java heap space内存溢出错误，创建的数组太大了超出了JVM分配的内存
//        int[] arr = new int[1024*1024*1024];


        System.out.println("后续代码");
    }
}
