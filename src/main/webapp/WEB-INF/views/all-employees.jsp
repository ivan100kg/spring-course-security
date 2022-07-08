<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ivan
  Date: 07.07.2022
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<h3>Information for all employees</h3>
<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href='hr-info'">
    Only for HR stuff
</security:authorize>
<br>
<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance" onclick="window.location.href='manager-info'">
    Only for Managers
</security:authorize>
</body>
</html>
