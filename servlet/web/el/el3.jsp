<%@ page import="cn.itcast.web.Demo773.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2020/6/9
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
    <%
    User user = new User();
    user.setName("张三");
    user.setAge(23);
    user.setBirthday(new Date());

    request.setAttribute("u",user);

    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list",list);

    Map map = new HashMap();
    map.put("sname","李思");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);
    %>
<h3>el获取对象中的值</h3>
${requestScope.u.name}<br>
${u.age}<br>
${u.birthday}<br>
${u.birStr}<br>

<h3>el获取List值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2]}<br>
${list[2].name}<br>
${list[2].age}<br>
${list[2].birthday}<br>
${list[2].birStr}<br>


    <h3>el获取Map值</h3>
    ${map}<br>
    ${map.sname}<br>
    ${map.gender}<br>
    ${map["gender"]}<br>
    ${map.user.name}<br>
    ${map.user.age}<br>

</body>
</html>
