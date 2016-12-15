<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>eElectronics - HTML eCommerce Template</title>

<!-- Google Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100'
	rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/signin.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="header-area">
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="user-menu">
						<ul>
							<li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
							<li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
							<li><a href="cart.html"><i class="fa fa-user"></i> My
									Cart</a></li>
							<li><a href="checkout.html"><i class="fa fa-user"></i>
									Checkout</a></li>
							<li><a href="#"><i class="fa fa-user"></i> Login</a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-4">
					<div class="header-right">
						<ul class="list-unstyled list-inline">
							<li class="dropdown dropdown-small"><a
								data-toggle="dropdown" data-hover="dropdown"
								class="dropdown-toggle" href="#"><span class="key">currency
										:</span><span class="value">USD </span><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">USD</a></li>
									<li><a href="#">INR</a></li>
									<li><a href="#">GBP</a></li>
								</ul></li>

							<li class="dropdown dropdown-small"><a
								data-toggle="dropdown" data-hover="dropdown"
								class="dropdown-toggle" href="#"><span class="key">language
										:</span><span class="value">English </span><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">English</a></li>
									<li><a href="#">French</a></li>
									<li><a href="#">German</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End header area -->

	<div class="site-branding-area">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 ">
					<div class="logo">
						<h1>
							<a href="index.html">e<span>Electronics</span></a>
						</h1>
					</div>
				</div>


			</div>
		</div>
	</div>
	<!-- End site branding area -->
	<div>
		<div class="zigzag-bottom" style="background: none repeat scroll 0 0 #000000; z-index: 0;bottom: 25px; height: 90px" ></div>
		<div class="container">
			<div class="row" style="height: 339px">
				<div class="col-md-5 col-md-offset-3">
					<form role="form" method="post" class="form-signin"
						action="login">
						<h2 class="form-signin-heading">Please sign in</h2>
						<h3 style="color: red;">${error }</h3>
						<label class="sr-only" for="inputUserName">User name</label> <input
							type="username" autofocus="" required="" placeholder="User name"
							name="username" class="form-control" id="inputUserName">
						<label class="sr-only" for="inputPassword">Password</label> <input
							type="password" name="password" required=""
							placeholder="Password" class="form-control" id="inputPassword">
						<div class="checkbox">
							<label> <input type="checkbox" value="remember-me">
								Remember me
							</label>
						</div>
						<button type="submit" class="btn btn-lg btn-primary btn-block">Sign
							in</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>

	<div class="footer-bottom-area"  >
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="copyright">
						<p>
							&copy; 2015 eElectronics. All Rights Reserved. Coded with <i
								class="fa fa-heart"></i> by <a href="http://wpexpand.com"
								target="_blank">WP Expand</a>
						</p>
					</div>
				</div>

				<div class="col-md-4">
					<div class="footer-card-icon">
						<i class="fa fa-cc-discover"></i> <i class="fa fa-cc-mastercard"></i>
						<i class="fa fa-cc-paypal"></i> <i class="fa fa-cc-visa"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End footer bottom area -->

	<!-- Latest jQuery form server -->
	<script src="https://code.jquery.com/jquery.min.js"></script>

	<!-- Bootstrap JS form CDN -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

	<!-- jQuery sticky menu -->
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.sticky.js"></script>

	<!-- jQuery easing -->
	<script src="js/jquery.easing.1.3.min.js"></script>

	<!-- Main Script -->
	<script src="js/main.js"></script>
</body>
</html>