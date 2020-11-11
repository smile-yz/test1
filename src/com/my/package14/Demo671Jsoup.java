package com.my.package14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo671Jsoup {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = Demo671Jsoup.class.getClassLoader().getResource("Demo669student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取所有student对象那个
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("======================");

        //获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);

        //获取number属性值为heima_0001的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number","heima_0001");
        System.out.println(elements2);
    }

}
