package com.my.package14;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo674JsoupXpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获取student.xml的path
        String path = Demo674JsoupXpath.class.getClassLoader().getResource("Demo669student.xml").getPath();
        //获取document对象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //根据document对象，创建JxDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //结合xpath语法查询
        List<JXNode> jxNodes =  jxDocument.selN("//student");
        for(JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("===================================");
        //查询所有student下的name标签
        List<JXNode> jxNode1 = jxDocument.selN("//student/name");
        for(JXNode jxNode : jxNode1) {
            System.out.println(jxNode);
        }
        System.out.println("===================================");

        //查询student标签下带有id属性的name标签
        List<JXNode> jxNode2 = jxDocument.selN("//student/name[@id]");
        for(JXNode jxNode : jxNode2) {
            System.out.println(jxNode);
        }
        System.out.println("===================================");

        //查询student标签下带id属性的name标签，并且id属性值为itcast
        List<JXNode> jxNode3 = jxDocument.selN("//student/name[@id='itcast']");
        for(JXNode jxNode : jxNode3) {
            System.out.println(jxNode);
        }
    }
}
