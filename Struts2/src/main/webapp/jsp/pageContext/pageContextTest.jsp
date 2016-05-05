<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--
        共享数据
        1. 默认在page范围内
        2. request范围内
        3. session范围内
        4. application范围内
        -->
    <%
        pageContext.setAttribute("name","feifei");
        pageContext.setAttribute("name2","feifei2",PageContext.REQUEST_SCOPE);
        pageContext.setAttribute("name3","feifei3",PageContext.SESSION_SCOPE);
        pageContext.setAttribute("name4","feifei4",PageContext.APPLICATION_SCOPE);
    %>
    <%=pageContext.getAttribute("name")%>
    <%=pageContext.getAttribute("name",PageContext.PAGE_SCOPE)%>


    <br />

    <!--
        获取其他内置对象
        1. request
        2. response
        3. config
        4. application
        5. session
    -->

</body>
</html>
