package cn.itcast.web.servlet2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置request编码
        request.setCharacterEncoding("utf-8");
        //2.获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkcode = request.getParameter("checkcode");

        //3.先获取生成的验证码
        HttpSession session = request.getSession();
        String checkcode_session = (String)session.getAttribute("checkcode_session");

        //删除验证码
        session.removeAttribute("checkcode_session");

        //3.先判断验证码是否正确
        if(checkcode_session !=null && checkcode_session.equalsIgnoreCase(checkcode)){
            //忽略大小写比较
            //验证码正确
            //判断用户名和密码是否一致
            if("zhangsan".equals(username) && "123".equals(password)) {
                //登陆成功
                //存储信息，用户信息
                session.setAttribute("user",username);
                //重定向到success.jsp
                response.sendRedirect(request.getContextPath() + "/success.jsp");

            }else{
                //登陆失败
                //存储提示信息
                request.setAttribute("login_error","用户名或密码错误");
                //转发到登陆页面
                request.getRequestDispatcher("/Demo760login.jsp").forward(request,response);
            }




        }else{
            //验证码不一致
            //存储提示信息到request
            request.setAttribute("cc_error","验证码错误");
            //转发到的登陆页面
            request.getRequestDispatcher("/Demo760login.jsp").forward(request,response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
