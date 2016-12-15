<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome to YaEshop</title>
</head>
<body>
	<h2>Welcome to Yet Another E-BookShop</h2>
	<form method='get' action='search'>
		Choose an Author: <select name='author' size='1'>
			<option value=''>Select...</option>
			
			<c:forEach var="author" items="${authors}">
				<option value='${author }'>${author }</option>	
			</c:forEach>
			
		</select><br />
		<p>OR</p>
		Search "Title" or "Author": <input type='text' name='search' /> <br />
		<br /> <input type='submit' value='SEARCH' /> <input type='reset'
			value='CLEAR' />
	</form>
</body>
</html>