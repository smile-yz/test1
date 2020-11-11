<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/9
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
    <%--
    完成数字编号对应星期几案例
    1.域中存储一数字
    2.使用choose标签取出数字   相当于switch声明
    3.使用when标签做数字判断   相当于case
    4.otherwise标签做其他情况的声明   相当于default
    --%>
    <%
    request.setAttribute("number",11);
    %>

    <c:choose>
        <c:when test="${number == 1}">星期1</c:when>
        <c:when test="${number == 2}">星期2</c:when>
        <c:when test="${number == 3}">星期3</c:when>
        <c:when test="${number == 4}">星期4</c:when>
        <c:when test="${number == 5}">星期5</c:when>
        <c:when test="${number == 6}">星期6</c:when>
        <c:when test="${number == 7}">星期7</c:when>
        <c:otherwise>你输入个嘛呀</c:otherwise>
    </c:choose>
</body>
</html>
