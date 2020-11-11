<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/2
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <h1><%=request.getSession().getAttribute("user")%>,欢迎您！</h1>
</body>
</html>
