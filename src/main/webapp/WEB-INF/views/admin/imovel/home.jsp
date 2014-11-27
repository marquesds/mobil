<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Admin Imóvel</title>
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
			<a class="navbar-brand" href="/mobil/admin"><img class="logo"
				alt="Logo" src="<c:url value="/resources/img/house.png" />">
				Mobil</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="/mobil/admin/imovel">Imóvel</a></li>
				<li><a href="/mobil/admin/cliente">Cliente</a></li>
				<li><a href="/mobil/admin/funcionario">Funcionario</a></li>
				<c:if test="${usuarioLogado != null}">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <c:set var="nome"
								value="${fn:split(usuarioLogado.nome, ' ')}" /> Olá,
							${nome[0]}! <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/mobil/admin">Administração</a></li>
							<li><a href="/mobil/">Área do Cliente</a></li>
							<li><a href="#">Editar Perfil</a></li>
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
	<br />

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-12">
				<div class="btn-toolbar">
					<a class="btn btn-primary" href="/mobil/admin/imovel/cadastro">Novo Imóvel</a>
				</div>
				<br />
				<div class="well">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>#</th>
								<th>Endereço</th>
								<th>Complemento</th>
								<th>CEP</th>
								<th>Tipo</th>
								<th>Preço</th>
								<th class="center">Disponível?</th>
								<th style="width: 50px;"></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
							<tr>
								<td>2</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
							<tr>
								<td>3</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
							<tr>
								<td>4</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
							<tr>
								<td>5</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
							<tr>
								<td>6</td>
								<td><a href="#">Rua Doutor João Sabino, 1249 - Vila Boa Vista I, São Carlos - SP</a></td>
								<td>Não</td>
								<td>13575-050</td>
								<td>Aluguel</td>
								<td>R$ 1200,00</td>
								<td class="center">Sim</td>
								<td>
									<div style="margin-top: 3px;">
										<a href="#" title="Editar" class="pull-left"><i class="glyphicon glyphicon-pencil"></i></a>
										<a href="#" title="Remover" class="pull-right"><i class="glyphicon glyphicon-remove"></i></a>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<center>
					<nav>
					<ul class="pagination">
						<li><a href="#"><span aria-hidden="true">&laquo;</span><span
								class="sr-only">Previous</span></a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#"><span aria-hidden="true">&raquo;</span><span
								class="sr-only">Next</span></a></li>
					</ul>
					</nav>
				</center>
			</div>
		</div>
	</div>

	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>