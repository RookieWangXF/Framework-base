<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println(headerName + "-->" + request.getHeader(headerName) + "<br />");
        }
        out.println("<hr />");
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String[] color = request.getParameterValues("color");
        String national = request.getParameter("country");
    %>

    你的名字是:<%=name%>
    你的性别是:<%=gender%>
    颜色是:<%for (String c : color){
            out.println(c + " ");
        }%>
    <hr />
    来自国家是:<%=national%>
</body>
</html>
