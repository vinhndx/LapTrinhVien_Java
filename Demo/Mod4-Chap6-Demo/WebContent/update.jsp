<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
	<form action="update" method="post">
		Ten sach: <input type="text" name="title" value="${book.title }"><br>
		Gia:      <input type="text" name="price" value="${book.price }"><br>
		Tac gia: <input type="text" name="author" value="${book.author }"><br>
		<input type="hidden" name="id"  value="${book.id }">
		<input type="submit" value="Cap Nhat">
	</form>
</body>
</html>