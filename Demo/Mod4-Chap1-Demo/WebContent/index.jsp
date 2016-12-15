<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello JBOSS</h1>

<form action="tinhtong" method="get">
	So thu 1: <input type="text" name="so1" value="${param.so1}"><br> 
	So thu 2: <input type="text" name="so2" value="${param.so2}"><br>
	<input type="submit" value="Tinh">
</form>

Ket qua la: ${kq}
</body>
</html>