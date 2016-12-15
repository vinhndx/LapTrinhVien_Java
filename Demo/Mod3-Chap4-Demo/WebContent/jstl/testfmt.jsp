<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Number Format:</h3>
	
	<c:set var="balance" value="120000.2309" />
	<fmt:setLocale value="es_ES"/>
	
	<p>Formatted Number (1): <fmt:formatNumber value="${balance}" 
	            type="currency"/></p>
	            
	<p>Formatted Number (2): <fmt:formatNumber type="number" 
	            maxIntegerDigits="3" value="${balance}" /></p>
	            
	<p>Formatted Number (3): <fmt:formatNumber type="number" 
	            maxFractionDigits="3" value="${balance}" /></p>
	<p>Formatted Number (4): <fmt:formatNumber type="number" 
	            groupingUsed="false" value="${balance}" /></p>
	<p>Formatted Number (5): <fmt:formatNumber type="percent" 
	            maxIntegerDigits="3" value="${balance}" /></p>
	<p>Formatted Number (6): <fmt:formatNumber type="percent" 
	            minFractionDigits="10" value="${balance}" /></p>
	<p>Formatted Number (7): <fmt:formatNumber type="percent" 
	            maxIntegerDigits="3" value="${balance}" /></p>
	<p>Formatted Number (8): <fmt:formatNumber type="number" 
	            pattern="###.###E0" value="${balance}" /></p>
	<p>Currency in USA :
	
	<fmt:setLocale value="fr_FR"/>
	<fmt:formatNumber value="${balance}" type="currency"/></p>
</body>
</html>