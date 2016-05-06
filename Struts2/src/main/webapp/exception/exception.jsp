<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    exception<br/>
    <hr/>
    <h4>Exception Name: <s:property value="exception"/></h4>
    <h4>Exception Details: <s:property value="exceptionStack"/></h4>
    <h4>Exception message: <s:property value="exception.message"/></h4>


    <a href="<s:url action='index'/> ">Return to home page</a>
</body>
</html>