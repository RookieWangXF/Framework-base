<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: 201601120071
  Date: 2016/5/5
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Put</title>
</head>
<body>

    get-application:<%=application.getAttribute("counter")%>

    <!-- 获取配置参数,用来调用数据库查询 -->
    <%
        String driver = application.getInitParameter("driver");
        String url = application.getInitParameter("url");
        String user = application.getInitParameter("user");
        String pass = application.getInitParameter("pass");

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from user");
    %>

    <table border="1" width="480">
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getInt(1)%></td>
            <td><%=rs.getString(2)%></td>
        </tr>
        <%
            }
        %>
        </table>
</body>
</html>
