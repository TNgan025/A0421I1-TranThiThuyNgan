<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/5/2021
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Find an user by name</title>
</head>
<body>
<form action="/users" method="get">
    <input type="hidden" name="action" value="find">
    <input name="name">
    <button type="submit">Find</button>
</form>
</body>
</html>
