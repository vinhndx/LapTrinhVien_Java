<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 2</title>
</head>
<body>
<h1>PAGE 2</h1>
<%
session.invalidate();
%>
<h2><%=request.getAttribute("test") %></h2>


<form action="demo" method="post">
<input type="submit" value="goi servlet">
</form>


</body>
</html>