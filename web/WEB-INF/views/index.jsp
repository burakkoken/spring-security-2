<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 14.7.2017
  Time: 01:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>

  <a href="/login">Login</a>
  <a href="/register">Register</a>
  <a href="/welcome">Welcome</a>
  <sec:authorize access="isAuthenticated()">
    <a href="/settings">Settings</a>
  </sec:authorize>


</body>
</html>
