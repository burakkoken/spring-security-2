<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 14.7.2017
  Time: 01:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="/logout" method="post">
        <input type="submit" value="Oturumu Kapat"/>
        <!--
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        -->
    </form:form>


</body>
</html>
