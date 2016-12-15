
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
		<header class="jumbotron hero-spacer">
			<p>Movie Management</p>
		</header>
		<div class="thumbnail">
			<img alt=""
				src="http://www.fleximoviedownloads.com/wp-content/uploads/2009/10/Johnny-Depp-movie-poster-001.jpg">

			<div class="caption">
				<h3>Function</h3>

				<p>
					<a class="btn btn-primary" href="#">Add new!</a> <a
						class="btn btn-default" href="#">Movie List !</a>
				</p>
			</div>
		</div>
		<%@include file="template/footer.jsp"%>
	</div>
</body>