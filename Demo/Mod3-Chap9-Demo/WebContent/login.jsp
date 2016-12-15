<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="j_security_check" method="post">
		Nhap tai khoan <br> <input type="text" name="j_username">
		Nhap mat khau <br> <input type="password" name="j_password">
		<br> <input type="submit" value="Dang Nhap">
	</form>
</body>
</html>