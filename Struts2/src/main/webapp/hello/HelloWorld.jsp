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
    <!-- index页面点击链接后，由对应的action处理，最终跳转到此页面进行显示,需要设置参数的get方法 -->
    <h2>message = <s:property value="messageStore.message" />
               is <s:property value="name" /> </h2>
    <h2>messageStore = <s:property value="messageStore" /></h2>


    <a href="../index.jsp">Return to home page</a> <br />
    <a href="<s:url action='index'/> ">Return to home page through action</a>
</body>
</html>
