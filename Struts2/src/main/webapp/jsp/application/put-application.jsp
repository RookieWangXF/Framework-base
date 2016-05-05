<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Put</title>
</head>
<body>
    <!-- 声明一个变量 -->
    <%!
        int i;
    %>
    <%
        application.setAttribute("counter",String.valueOf(++i));
    %>
    <%=i%>
</body>
</html>
