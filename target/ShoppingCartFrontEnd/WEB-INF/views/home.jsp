<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>

<a href="login"> login </a>
<br>			
<a href="register"> register</a>

<hr>
<c:if test="${showLoginPage}">
<jsp:include page="login.jsp"></jsp:include>
<jsp:include page="register.jsp"></jsp:include>
</body>
</html>