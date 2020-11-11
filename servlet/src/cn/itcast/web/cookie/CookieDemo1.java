package cn.itcast.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        1. 创建Cookie对象，绑定数据
			* new Cookie(String name, String value)
		2. 发送Cookie对象
			* response.addCookie(Cookie cookie)
		3. 获取Cookie，拿到数据
			* Cookie[]  request.getCookies()
         */
        Cookie c = new Cookie("msg","hello");
        response.addCookie(c);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
