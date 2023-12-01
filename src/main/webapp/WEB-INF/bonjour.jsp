<%--
  Created by IntelliJ IDEA.
  User: lorenzo
  Date: 01/12/2023
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Coucou</h1>
<p>${variable}</p>
<%-- Scriptlet --%>
<%
    for(int i = 0; i < 10; i++) {
        out.println("<p>" + request.getAttribute("variable") + "</p>");
    }
%>
<%-- JSP --%>
<%
    for(int i = 0; i < 10; i++) {
%>
<p>${i}: ${variable}</p>
<%
    }
%>


</body>
</html>
