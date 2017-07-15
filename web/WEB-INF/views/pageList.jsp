<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.7.2017
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>
            <th>Name</th>
        </tr>
        <c:forEach items="${pageListHolder.pageList}" var="item">
            <tr>
                <td>${item}</td>
            </tr>
        </c:forEach>
    </table>


    <!-- pagination -->
    <c:if test="${pageListHolder.pageCount > 1}">
        <ul>
            <!-- previous page -->
            <c:if test="${!pageListHolder.firstPage}">
                <li>
                    Previous
                </li>
            </c:if>

            <c:forEach begin="${beginIndex}"
                end="${endIndex}" var="pageNum">

                <c:choose>
                    <c:when test="${pageListHolder.page + 1 == pageNum}">
                        <li>
                            <a href="">
                                <b>${pageNum}</b>
                            </a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li>
                            <a href="">
                                    ${pageNum}
                            </a>
                        </li>
                    </c:otherwise>
                </c:choose>

            </c:forEach>

            <!-- next page -->
            <c:if test="${!pageListHolder.lastPage}">
                <li>
                    Next
                </li>
            </c:if>
        </ul>
    </c:if>

</body>
</html>
