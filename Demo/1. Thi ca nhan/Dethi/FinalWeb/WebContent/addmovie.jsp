
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/include.jsp"%>
<!DOCTYPE html>
<html>
<head>


<title>Home</title>
<%@include file="template/include-head.jsp"%>
</head>
<body>

	<div class="container">
		<%@include file="template/menu.jsp"%>
		<!--  wellcome Form -->
		<p style="color: green;">
			<b>Tạo mới movie</b>
		</p>
		<div class="col-md-6">
			<div id="message">
				<span>${(a_message == nul)?'':a_message }</span>
			</div>
			<form role="form" method="post" action="./MovieCreateServlet">
				<div class="form-group">
					<label for="movieName">Tên phim </label> <input type="text"
						name="movieName" class="form-control">
				</div>
				<div class="form-group">
					<label for="duration">Thời lượng</label> <input type="text"
						name="duration" class="form-control">
				</div>
				<div class="form-group">
					<label for="image">Hình đại diện</label> <input type="text"
						name="image" class="form-control">
				</div>

				<div class="form-group">
					<label for="rating">đánh giá</label> <select class="form-control"
						id="rating" name="rating">
						<option value="1.0">1</option>
						<option value="2.0">2</option>
						<option value="3.0">3</option>
						<option value="4.0">4</option>
						<option value="5.0">5</option>
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