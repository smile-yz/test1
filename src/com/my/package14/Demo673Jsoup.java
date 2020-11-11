package com.my.package14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo673Jsoup {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = Demo673Jsoup.class.getClassLoader().getResource("Demo669student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("======================================");
        //查询id值为itcast元素
        Elements elements1 = document.select("#itcast");
        System.out.println(elements1);
        System.out.println("======================================");

        //获取student标签并且number属性值为heima_0001的age子标签
        //取student标签并且number属性值为heima_0001
        Elements elements2 = document.select("student[number='heima_0001']");
        System.out.println(elements2);
        System.out.println("======================================");


        Elements elements3 = document.select("student[number='heima_0001'] > age");
        System.out.println(elements3);


    }
}
