<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.t3h.bean.Address"%>
<%@page import="com.t3h.bean.Person"%>
<%@page session="true" errorPage="errorpage.jsp"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="t3h" uri="http://mytaglib.t3h.vn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ include file="head.jsp" %>

<%-- <jsp:include page="head.jsp"></jsp:include> --%>

<%-- <jsp:forward page="page2.jsp"></jsp:forward> --%>

<body>

<a href="jstl/testcore.jsp">Test JSTL CORE</a>
<a href="jstl/testfmt.jsp">Test JSTL FMT</a>
<a href="jstl/testsql.jsp">Test JSTL SQL</a>

<hr>
<h2>Hello <%= session.getAttribute("username") %></h2>

<%
Person p = new Person();
p.setName("Nguyen van a");
Address a = new Address();
a.setNumber("123");
p.setAddress(a);

pageContext.setAttribute("p", p);

%>

Ten:<%=p.getName() %><br>
Dia chi: <%=p.getAddress().getNumber() %><br>


Ten: ${p.name }<br>
Dia chi: ${p.address.number }<br>

<t3h:if test="${false}">
	Param: ${param.ten }
</t3h:if>

Ten: 

<br>
<a href="logout">Dang xuat</a>


<%

//request.setAttribute("test", "TEST in REQUEST");
//session.setAttribute("test", "TEST in SESSION");
pageContext.setAttribute("test", "TEST in PAGECONTEXT");
application.setAttribute("test", "TEST in APPLICATION");

List<String> lst = new ArrayList<String>();
lst.add("Khong");
lst.add("Mot");
lst.add("Hai");
lst.add("Ba");

pageContext.setAttribute("lst", lst);
%>

<h2>Bien test: ${test}</h2>

${lst[2]}

<%
for(String s : lst){ 
pageContext.setAttribute("s", s);
%>
<h2>Gia tri: ${s}</h2>
<%	
}

%>

</body>
</html>