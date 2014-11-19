<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Login</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
<link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
	type="img/ico" />
</head>
<body>
	<div class="container">
		<div class="row vertical-offset-100">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<a href="/mobil/"><img class="logo" alt="Logo" title="Home"
								src="<c:url value="/resources/img/house.png" />"></a> Login
						</h3>
					</div>
					<div class="panel-body">
						<form method="post" action="j_spring_security_check">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="E-mail"
										name="j_username" type="text" required autofocus>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="j_password" type="password" value="" required>
								</div>
								<input class="btn btn-lg btn-success btn-block" type="submit"
									value="Login">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="http://mymaplist.com/js/vendor/TweenLite.min.js"></script>
	<script src="<c:url value="/resources/js/main.js" />"></script>
</body>
</html>