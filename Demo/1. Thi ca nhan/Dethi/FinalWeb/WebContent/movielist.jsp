
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/include.jsp"%>
<!DOCTYPE html>
<html>
<head>


<title>Movie List</title>
<%@include file="template/include-head.jsp"%>
</head>
<body>

	<div class="container">
		<%@include file="template/menu.jsp"%>
		<!--  wellcome Form -->
		<p style="color: green;">Màn hình tìm kiếm</p>
		<div class="row">
			<div class="col-md-6">
				<form role="form" method="post" action="./MovieListServlet">
					<div class="form-group">
						<label for="movieName">Tên phim </label> <input type="text"
							name="movieName" class="form-control">
					</div>

					<p>
						<button class="btn btn-primary" type="submit">Tìm kiếm</button>
						<button class="btn btn-default" type="button">Reset</button>
					</p>

				</form>
			</div>
		</div>

		<%
			List<AptMovie> movies = (List<AptMovie>) request
					.getAttribute("movieList");
		%>
		<p style="color: green;">
			Kết quả tìm kiếm :
			<%=movies == null ? "0" : movies.size()%>
			kết quả
		</p>
		<c:set var="movies" value="<%=movies%>"></c:set>

		<div class="col-md-12">
			<table class="table table-striped">
				<thead>
					<tr>

						<th>Tên phim</th>
						<th>Năm sản xuất</th>
						<th>Thời gian</th>
						<th>đánh giá</th>
						<th>Hình ảnh</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${movies}" var="mv">
						<tr>
							<td><c:out value="${mv.name}"></c:out></td>
							<td><c:out value="${mv.publicYear }"></c:out></td>

							<td><c:out value="${mv.duration }"></c:out></td>
							<td><c:out value="${mv.rating }"></c:out></td>
							<td><img alt="" src="${mv.image }" style="height: 50px"></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<%@include file="template/footer.jsp"%>
	</div>
</body>