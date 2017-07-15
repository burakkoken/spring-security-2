<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 14.7.2017
  Time: 01:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form method="post" action="/session">
        <input type="text" name="username"/>
        <br>
        <input type="password" name="password"/>
        <br>
        <input type="submit" value="Oturum Aç"/>
    </form:form>


</body>
</html>
