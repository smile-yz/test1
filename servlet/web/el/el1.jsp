<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/2
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    \${3 > 4}
    ${3 > 4}
<hr>
    <h3>算数运算符</h3>
    ${3 + 4}<br>
    ${3 - 4}<br>
    ${3 * 4}<br>
    ${3 div 4}<br>
    ${3 / 4}<br>
    ${10 / 3}<br>
    ${3 mod 4}<br>
    ${3 % 4}<br>
    <h3>比较运算符</h3>
    ${3 > 4 && 3 < 4}<br>
    ${3 > 4 and 3 < 4}<br>

    <h4>empty运算符</h4>
    <%
    String str = "";
    request.setAttribute("str",str);

    List list = new ArrayList();
    request.setAttribute("list",list);
    %>
    ${empty str}<br>
    ${not empty list}<br>
</body>
</html>
