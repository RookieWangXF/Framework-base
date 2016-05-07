<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h2>Hello World!</h2>

    <p>Example 1(hello):<a href="<s:url action='helloworld'/>">Hello World</a></p>
    <p>Example 1(Welcome):<a href="<s:url action='MyAction'/>">Welcome</a></p>
    <p>Example 1(Welcome*):<a href="<s:url action='helloworld12'/>">Welcome*</a></p>
    <p>Example 1(*html*):<a href="<s:url action='feihtml23'/>">resultHtml</a></p>

    <p>Example 2(register):<a href="register/register.jsp">Register</a></p>
    <p>Example 3(edit):<a href='<s:url action="edit"/> '>Edit your information</a></p>

    <p>Example 4(exception)</p>
    <p><a href='<s:url action="causeexception" />'>Cause Exception</a></p>
    <p><a href='<s:url action="causenullpointerexception" />'>Cause Null Pointer Exception</a></p>
    <p><a href='<s:url action="causesecurityexception" />'>Cause Global Security Exception</a></p>
    <p><a href='<s:url action="actionspecificexception" />'>Cause ActionSpecific Security Exception</a></p>

    <p>Example 5(movie rest):<a href="movie/2">Get movie with id value of 2</a></p>
</body>
</html>
