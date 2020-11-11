package cn.itcast.web.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo706Request")
public class Demo706Request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo88888被访问。。。。。");
        //存储数据到request域中
        request.setAttribute("msg","hello");

        //转发到demo706Request2
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Demo706Request2");
        requestDispatcher.forward(request,response);*/
        request.getRequestDispatcher("/Demo706Request2").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);

    }
}
