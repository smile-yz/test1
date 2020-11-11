<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/9
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐士对象</title>
</head>
<body>
    ${pageContext.request}
    <h4>动态获取虚拟目录</h4>
    ${pageContext.request.contextPath}

    <%
    response.sendRedirect(request.getContextPath() + "");
    %>
</body>
</html>
