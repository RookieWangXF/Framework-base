<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Register</title>
</head>
<body>
	<h1>This is a website of Register</h1>
	<form action="${pageContext.request.contextPath }/register.action" name="frmRegister" method="post" >
		UserName:<input type="text" name="name"> <br />
		PassWord:<input type="text" name="pwd"> <br />
		<input type="submit" value="Register "> 
	</form>
</body>
</html>