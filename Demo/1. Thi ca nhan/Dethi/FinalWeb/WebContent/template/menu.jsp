
<%@page import="com.apt.web.entity.AptAccount"%>
<%@page import="com.apt.web.util.ConfigUtil"%>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Final Exam Project</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="home.jsp">Home</a></li>
				<li><a href="addmovie.jsp">Add Movie</a></li>
				<li><a href="movielist.jsp">List Movie</a></li>
				<li><a href="adduser.jsp">Add User</a></li>
				<li><a href="accountlist.jsp">List Account</a></li>


			</ul>
			<ul class="nav navbar-nav navbar-right">

				<%
					AptAccount account = null;
					if (request.getSession().getAttribute(ConfigUtil.S_USER) != null) {
						account = (AptAccount) request.getSession().getAttribute(
								ConfigUtil.S_USER);
					}
				%>
				<%
					if (account != null) {
				%>
				<li><a href="#"><%=account.getFullname()%></a></li>
				<li><a href="./LogoutServlet"> Thoát</a></li>
				<%
					}
				%>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	<!--/.container-fluid -->
</nav>