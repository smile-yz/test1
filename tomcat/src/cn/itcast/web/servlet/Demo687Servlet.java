package cn.itcast.web.servlet;
import javax.servlet.*;
import java.io.IOException;

/*
servlet的方法
 */
public class Demo687Servlet implements Servlet{
    /**
     * 初始化方法
     * 在servlet被创建时执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");
    }

    /**
     * 获取Servlet的一些信息，版本，作者等
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次servlet被访问时都会执行。执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭servlet时执行，执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy.......");
    }
}
