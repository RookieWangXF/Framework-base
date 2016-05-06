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
        <s:textfield name="personBean.name" label="Name"></s:textfield> <br />
        <s:textfield name="personBean.email" label="Email"></s:textfield> <br />
        <s:textfield name="personBean.age" label="Age"></s:textfield>

        <s:submit/>

    </s:form>
</body>
</html>
