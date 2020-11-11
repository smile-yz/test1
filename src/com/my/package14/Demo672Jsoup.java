package com.my.package14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo672Jsoup {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = Demo672Jsoup.class.getClassLoader().getResource("Demo669student.xml").getPath();
        //2.获取Document对象
        Document document = Jsoup.parse(new File(path),"utf-8");
        //通过Document对象获取name标签，获取所有的name 标签，可以获取到两个
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());

        Element element_student = document.getElementsByTag("student").get(0);
        Elements ele_name = element_student.getElementsByTag("name");
        System.out.println(ele_name);

        //获取student对象的属性值
        String number = element_student.attr("number");
        System.out.println(number);
        //获取文本内容
        String text1 = ele_name.text();
        String html = ele_name.html();
        System.out.println(text1);
        System.out.println(html);


    }
}
