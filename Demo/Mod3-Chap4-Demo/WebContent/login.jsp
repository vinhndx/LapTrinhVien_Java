<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="t3h" uri="http://mytaglib.t3h.vn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<t3h:if test="${not empty error}">
	<h3 style="color: red">${error }</h3>
</t3h:if>

	<form action="login" method="post">
		Nhap tai khoan <br> <input type="text" name="username">
		Nhap mat khau <br> <input type="password" name="password">
		<br> <input type="submit" value="Dang Nhap">
	</form>
</body>
</html>