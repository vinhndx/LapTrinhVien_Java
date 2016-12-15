<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h2>Danh sach cac quyen sach trong thu vien</h2>

	<h2>Co tong cong ${total } quyen sach trong thu vien</h2>
	<c:forEach var="book" items="${books }">
		<h3>${book.title } - ${book.author } - <a href="update?id=${book.id}">Cap Nhat</a> - <a href="remove?id=${book.id}">Xoa</a></h3>
	</c:forEach>
	
	<a href="book?page=${page - 1 }">Prev</a> 
	<c:forEach var="item" begin="1" end="${totalPage }">
		[<a href="book?page=${item}">${item }</a>]
		
	</c:forEach>
	<a href="book?page=${page + 1}">Next</a>
	<br>

	<a href="themmoi.jsp">Them quayen sach moi</a>
</body>
</html>