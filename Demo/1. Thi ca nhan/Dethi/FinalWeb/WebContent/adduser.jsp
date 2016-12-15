
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/include.jsp"%>
<!DOCTYPE html>
<html>
<head>


<title>Register User</title>
<%@include file="template/include-head.jsp"%>
</head>
<body>

	<div class="container">
		<%@include file="template/menu.jsp"%>
		<!--  wellcome Form -->
		<p style="color: green;">
			<b>Tạo mới user</b>
		</p>
		<div class="col-md-6">
			<div id="message">
				<span>${(a_message == nul)?'':a_message }</span>
			</div>
			<form role="form" method="post" action="./addUserServlet">
				<div class="form-group">
					<label for="username">Username</label> <input type="text"
						name="username" class="form-control">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="text"
						name="password" class="form-control">
				</div>
				<div class="form-group">
					<label for="fullName">Full Name</label> <input type="text"
						name="fullName" class="form-control">
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input type="text" name="email"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="phone">Phone</label> <input type="text" name="phone"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="role">Role</label> <select class="form-control"
						id="role" name="role">
						<option value="admin">Admin</option>
						<option value="user">User</option>
					</select>
				</div>
				<p>
					<button class="btn btn-primary" type="submit">Thêm mới</button>
					<button class="btn btn-default" type="button">Reset</button>
				</p>

			</form>
		</div>
		<%@include file="template/footer.jsp"%>
	</div>
</body>