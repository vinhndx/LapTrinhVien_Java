<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tinh Tong</title>
</head>
<body>
	<form action="tinhtong" method="get">
		So thu 1: <input type="text" name="so1" value="${param.so1}"><br> 
		So thu 2: <input type="text" name="so2" value="${param.so2}"><br>
		<input type="submit" value="Tinh">
	</form>
	
	<c:if test="${not empty kq }">
		<h2>Ket qua la: ${kq}</h2>
	</c:if>
</body>
</html>