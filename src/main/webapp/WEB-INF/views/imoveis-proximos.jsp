<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Imóveis Próximos</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
	type="img/ico" />
</head>
<body>
	<nav class="navbar-inverse navbar-fixed-top navbar-custom"
		role="navigation">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/mobil/"><img class="logo"
				alt="Logo" src="<c:url value="/resources/img/house.png" />">
				Mobil</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/mobil/venda">Venda</a></li>
				<li><a href="/mobil/locacao">Locação</a></li>
				<li><a href="/mobil/imoveis-proximos">Imóveis Próximos</a></li>
				<c:if test="${usuarioLogado != null}">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <c:set var="nome"
								value="${fn:split(usuarioLogado.nome, ' ')}" /> Olá,
							${nome[0]}! <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
						</ul></li>
				</c:if>
				<c:if test="${usuarioLogado == null}">
					<li><a href="/mobil/login">Login</a></li>
				</c:if>
			</ul>
			<form class="navbar-form navbar-left" role="search" id="search">
				<div class="row">
					<div class="col-lg-12">
						<div class="form-group">
							<div class="input-group input-search">
								<div class="inner-addon right-addon">
									<i class="glyphicon glyphicon-search" style="color: #B2DBFA;"></i>
									<input type="text" class="form-control" placeholder="Pesquisa">
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	<br />
	<br />
	<br />
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-12 col-lg-12">
				<iframe frameborder="0" scrolling="no" width="100%"
					marginheight="0" marginwidth="0"
					src="https://maps.google.ch/maps?f=q&amp;source=s_q&amp;hl=de&amp;geocode=&amp;q=Bern&amp;aq=&amp;sll=46.813187,8.22421&amp;sspn=3.379772,8.453979&amp;ie=UTF8&amp;hq=&amp;hnear=Bern&amp;t=m&amp;z=12&amp;ll=46.947922,7.444608&amp;output=embed&amp;iwloc=near"></iframe>
			</div>
		</div>
	</div>
</body>
</html>