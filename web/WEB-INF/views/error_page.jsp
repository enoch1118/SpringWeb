<%--
  Created by IntelliJ IDEA.
  User: emma
  Date: 2021/02/10
  Time: 11:55 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" import="java.util.*" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h4><c:out value="${exception.getMessage()}"/></h4>

<ul>
    <c:forEach items="${exception.getStackTrace()}" var="stack">
        <li><c:out value="${stack}"/></li>
    </c:forEach>
</ul>
</body>
</html>
