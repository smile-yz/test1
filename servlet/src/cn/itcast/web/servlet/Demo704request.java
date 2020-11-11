package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/Demo704request")
public class Demo704request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数
        //根据参数名称获取参数值
        String username = request.getParameter("username");
        //System.out.println("post");
        System.out.println(username);
        //根据参数名称获取参数值得数组
        String[] hobbies = request.getParameterValues("hobby");
        for(String hobby : hobbies) {
            System.out.println(hobby);
        }
        //获取所有请求得参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        /*while(parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("==============================");
        }*/
        //获取所有参数得map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历
        Set<String> keyset = parameterMap.keySet();
        for (String name : keyset) {
            //根据name（key键）获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for(String value : values) {
                System.out.println(value);
            }
            System.out.println("+++++++++++++++++++++++++++++");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数
        //根据参数名称获取参数值
        /*String username = request.getParameter("username");
        System.out.println("get");
        System.out.println(username);*/
        this.doPost(request,response); //简化代码
    }
}
