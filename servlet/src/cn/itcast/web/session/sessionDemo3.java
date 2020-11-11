package cn.itcast.web.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessionDemo3")
public class sessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用session共享数据
        //获取session
        HttpSession session = request.getSession();
        System.out.println(session);
        //期望客户端关闭后，session也能相同
        Cookie c = new Cookie("JSESSIONID",session.getId());
        c.setMaxAge(60*60);//一个小时
        response.addCookie(c);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
