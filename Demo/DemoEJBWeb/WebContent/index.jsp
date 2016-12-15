<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="TinhToanServlet" method="get">
		<div>
			<span>So thu 1</span><input type="text" name="so1" value="${param.so1 }">
		</div>

		<div>
			<span>So thu 2</span><input type="text" name="so2" value="${param.so2 }">
		</div>

		<!-- <div>
			<span>Chon phep tinh</span>
			<select name="pheptinh">
				<option value="cong">Cong</option>
				<option value="tru">Tru</option>
			</select>
		</div> -->

		<div>
			<input type="submit" value="cong" name="pheptinh">
			<input type="submit" value="tru" name="pheptinh">
		</div>
	</form>
	
	<c:if test="${not empty kq }">
		<h4>Ket qua la: ${kq }</h4>
	</c:if>
	
</body>
</html>