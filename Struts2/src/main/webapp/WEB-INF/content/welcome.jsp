
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/6
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>

    welcome to WEB-INF<br />

    target : <s:property value="target" /> <br/>
<a href="../index.jsp">Return to home page</a>  此链接应该不可以，因为路径不对 <br />
<a href="<s:url action='index'/> ">Return to home page through action</a>
</body>
</html>

