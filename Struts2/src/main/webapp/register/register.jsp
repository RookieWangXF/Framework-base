<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/6
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <s:form action="register">
        <s:textfield name="personBean.name" key="User"></s:textfield> <br />
        <s:textfield name="personBean.email" key="Email"></s:textfield> <br />
        <s:textfield name="personBean.age" key="Age"></s:textfield>

        <s:submit key="login"/>

    </s:form>
</body>
</html>
