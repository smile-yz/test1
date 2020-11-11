<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/2
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
    <%
       //在域中存储数据
       request.setAttribute("name","张三");
       session.setAttribute("age","23");

    %>
    <h3>el获取值</h3>
    ${requestScope.name}
    ${sessionScope.age}
    ${name}
</body>
</html>
