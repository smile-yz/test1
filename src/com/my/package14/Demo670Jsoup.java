package com.my.package14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo670Jsoup {
    public static void main(String[] args) throws IOException {
        //2.1获取Demo669student.xml的path
        String path = Demo670Jsoup.class.getClassLoader().getResource("Demo669student.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树--->Document
        //2.parse(String html):解析xml获html字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                " <students>\n" +
                " \t<student number=\"heima_0001\">\n" +
                " \t\t<name>tom</name>\n" +
                " \t\t<age>18</age>\n" +
                " \t\t<sex>male</sex>\n" +
                " \t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>jack</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\t\t \n" +
                " </students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);

        //parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://blog.csdn.net/qq_43083688/article/details/106101054");
        Document document1 = Jsoup.parse(url, 10000);
        System.out.println(document1);


    }
}
