<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = "feifei";
        Cookie c = new Cookie("username", name);
        c.setMaxAge(24 * 3600);
        response.addCookie(c);
    %>
</body>
</html>
