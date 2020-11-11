<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/2
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function() {
            //获取图片
           /* var img = document.getElementById("codimg");
            //绑定单击事件
            img.onclick = function() {
                //加时间戳
                var date = new Date().getTime();
                img.src = "/servlet/checkcodeservlet?" + date;
            }*/
           //简写
            document.getElementById("codimg").onclick = function() {
                this.src = "/servlet/checkcodeservlet?time=" + new Date().getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
    <form action="/servlet/loginServlet">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" placeholder="请输入用户名"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" placeholder="请输入密码"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkcode" placeholder="请输入验证码"></td>
            </tr>
            <tr>
                <td><img id="codimg" src="/servlet/checkcodeservlet"></td>
                <td><a href="">看不清换一张</a></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登陆"></td>
            </tr>

        </table>
    </form>
    <div><%=request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error")%></div>
    <div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>
</body>
</html>
