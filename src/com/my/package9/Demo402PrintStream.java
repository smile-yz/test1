package com.my.package9;
import java.io.PrintStream;
import java.io.FileNotFoundException;
/*
java.io.PrintStream打印流，为其他输出流添加了功能，使他们能够方便的打印各种数据值表示形式
特点：
1.只负责数据的输出，不负责读取数据
2.与其他流不同，PrintStream永远不会抛出IOException
3.有特有的方法print println方法
PrintStream extends OutputStream
使用使用继承自父类write方法写数据，那么查看数据的时候会查询编码表 97-a
如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97-97

 */
public class Demo402PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\yz\\Desktop\\共用图\\print.txt");
        ps.write(97);//a
        ps.print(97);//97
        ps.close();

        System.out.println("我是在输出台输出");//直接输出结果
        PrintStream ps1 = new PrintStream("C:\\Users\\yz\\Desktop\\共用图\\目的print.txt");
        System.setOut(ps1);
        System.out.println("我在打印流的目的地中输出");//写入到文本中
        System.out.println("目的地第二行");//写入到文本中
        ps.close();

    }
}
