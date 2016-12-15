<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="css	/bootstrap.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/theme.css" rel="stylesheet">
<!--  login css -->
<link href="css/signin.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
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

				<!--/.container-fluid -->
		</nav>
		<div id="message">
			<span>${(a_message == nul)?'':a_message }</span>
		</div>
		<!--  Login Form -->
		<form role="form" class="form-signin" action="/FinalWeb/LoginServlet">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label class="sr-only" for="inputUserName">User name</label> <input
				type="username" autofocus="" required="" placeholder="User name"
				name="username" class="form-control" id="inputUserName"> <label
				class="sr-only" for="inputPassword">Password</label> <input
				type="password" name="password" required="" placeholder="Password"
				class="form-control" id="inputPassword">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-lg btn-primary btn-block">Sign
				in</button>
		</form>
	</div>
</body>
</html>