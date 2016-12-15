
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/include.jsp"%>
<!DOCTYPE html>
<html>
<head>


<title>Account List</title>
<%@include file="template/include-head.jsp"%>
</head>
<body>

	<div class="container">
		<%@include file="template/menu.jsp"%>
		<!--  wellcome Form -->
		<p style="color: green;">Màn hình tìm kiếm</p>
		<div class="row">
			<div class="col-md-6">
				<form role="form" method="post" action="./AccountListServlet">
					<div class="form-group">
						<label for="username">Username</label> <input type="text"
							name="username" class="form-control">
					</div>

					<p>
						<button class="btn btn-primary" type="submit">Tìm kiếm</button>
						<button class="btn btn-default" type="button">Reset</button>
					</p>

				</form>
			</div>
		</div>

		<%
			List<AptAccount> accounts = (List<AptAccount>) request
					.getAttribute("accountList");
		%>
		<p style="color: green;">
			Kết quả tìm kiếm :
			<%=accounts == null ? "0" : accounts.size()%>
			kết quả
		</p>
		<c:set var="accounts" value="<%=accounts%>"></c:set>

		<div class="col-md-12">
			<table class="table table-striped">
				<thead>
					<tr>

						<th>Username</th>
						<th>Full Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Role</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${accounts}" var="account">
						<tr>
							<td><c:out value="${account.username}"></c:out></td>
							<td><c:out value="${account.fullname}"></c:out></td>

							<td><c:out value="${account.email}"></c:out></td>
							<td><c:out value="${account.phone}"></c:out></td>
							<td><c:out value="${account.role}"></c:out></td>
						 
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<%@include file="template/footer.jsp"%>
	</div>
</body>