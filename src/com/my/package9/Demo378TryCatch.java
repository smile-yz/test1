package com.my.package9;
import java.io.FileWriter;
import java.io.IOException;

/*

 */
public class Demo378TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让inally可以使用
        //
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\yz\\Desktop\\共用图\\i.txt");
            for (int i = 0; i < 10; i++) {
                fw.write("Hello Wrold!");
            }

        } catch(IOException e) {
            System.out.println(e);//打印基本报错信息
//            e.printStackTrace();//打印详细报错信息
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
