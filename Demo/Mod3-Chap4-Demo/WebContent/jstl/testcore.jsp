<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int i = 11;
%>

<c:out value="Hello"></c:out>

<c:set var="i" value="<%=i %>"></c:set>
<h2>Bien i: ${i }</h2>

<c:if test="${i == 10 }">
	<h3>i bang 10</h3>
</c:if>

<c:if test="${not (i == 10 )}">
	<h3>i khac 10</h3>
</c:if>

<c:choose>
	<c:when test="${i == 10 }">
		<h3>i bang 10</h3>
	</c:when>
	<c:when test="${i > 10 }">
		<h3>i lon hon 10</h3>
	</c:when>
	<c:otherwise>
		<h3>i be hon 10</h3>
	</c:otherwise>
</c:choose>

<%
List<String> lst = new ArrayList<String>();
lst.add("Khong");
lst.add("Mot");
lst.add("Hai");
lst.add("Ba");
%>
<c:set var="lst" value="<%=lst %>"></c:set>

<c:forEach var="item" items="${lst }" varStatus="stt">
	<h2>Gia tri ${stt.index}: ${item}</h2>
</c:forEach>

<%-- <c:import url="https://google.com"></c:import> --%>

</body>
</html>