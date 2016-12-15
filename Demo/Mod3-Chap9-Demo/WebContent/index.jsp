<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	String user = request.getRemoteUser();
	boolean isAdmin = request.isUserInRole("admin");
%>
<body>
	<%
		if (isAdmin) {
			response.sendRedirect("admin.jsp");
		} else {
			response.sendRedirect("user.jsp");
		}
	%>
</body>
</html>