<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="t3h" uri="http://mytaglib.t3h.vn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test page</h1>

	<h2>
		<t3h:hello ten="Toai ABC"> Xin chao ban...</t3h:hello>
	</h2>

	<h3>Ket thuc trang</h3>

	<t3h:if test="<%=true%>">
		<h2>Thoa dieu kien</h2>
	</t3h:if>

	<t3h:loop count="10">
		<h4>HELLOO</h4>
	</t3h:loop>

</body>
</html>