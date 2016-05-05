<%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form id="form1" method="post" action="requestTest.jsp">
        用户名：<input type="text" name="name"> <br/> <hr/>
        性别: boy:<input type="radio" name="gender" value="boy">
              girl:<input type="radio" name="gender" value="boy">
        <br /> <hr/>
        喜欢的颜色：<br/>
        红：<input type="checkbox" name="color" value="red">
        绿：<input type="checkbox" name="color" value="green">
        蓝：<input type="checkbox" name="color" value="blue">
        <br /> <hr/>
        来自的国家：<br />
        <select name="country">
            <option value="Chinese">Chinese</option>
            <option value="USA">USA</option>
            <option value="England">England</option>
        </select>
        <br /> <hr/>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</body>
</html>
