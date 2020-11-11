package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo701request")
public class Demo701request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据:user-agent
        String agent = request.getHeader("user-agent");
        System.out.println(agent);
        if(agent.contains("Chrome")) {
            //谷歌
            System.out.println("谷歌来了。。。。。。。。");
        } else if(agent.contains("Firefox")) {
            System.out.println("火狐来了。。。。。。。。");
        }
        //获取referer
        String referer = request.getHeader("referer");
        System.out.println(referer);
        //防盗链
        if(referer != null) {
            if(referer.contains("/demo")){
                //System.out.println("播放电影。。。");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放电影。。。");
            } else {
                //System.out.println("想看电影么？关机睡觉吧");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看电影么？关机睡觉吧");
            }
        }
    }
}
