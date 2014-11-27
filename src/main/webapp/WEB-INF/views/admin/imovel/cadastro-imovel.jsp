<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Cadastro de Imóvel</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
	type="img/ico" />

<style type="text/css">
body {
	margin-top: 80px;
}

.form-control {
	margin-bottom: 10px;
}
</style>

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
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-xs-12 col-sm-12 col-md-8 well well-sm">
				<legend>
					<a href="/mobil/"><img class="logo" title="Home" alt="Logo"
						src="<c:url value="/resources/img/house.png" />"></a> Cadastro
					de Imóvel
				</legend>
				<form class="form" method="POST" action="adicionaImovel">
					<div class="row">
						<div class="col-xs-12">
							<input class="form-control" name="rua" placeholder="Rua"
								type="text" required autofocus />
						</div>
					</div>

					<div class="row">
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="numero" placeholder="Número"
								type="number" required />
						</div>
						<div class="col-xs-8 col-md-8">
							<input class="form-control" name="bairro" placeholder="Bairro"
								type="text" required />
						</div>
					</div>

					<input class="form-control" name="complemento"
						placeholder="Complemento" type="text" />


					<div class="row">
						<div class="col-xs-8 col-md-8">
							<input class="form-control" name="cidade" placeholder="Cidade"
								type="text" required />
						</div>
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="estado" placeholder="Estado"
								type="text" required />
						</div>
					</div>

					<div class="row">
						<div class="col-xs-8 col-md-8">
							<input class="form-control" name="cep" id="cep" placeholder="CEP"
								type="text" required />
						</div>
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="preco" id="cep"
								placeholder="Preço" type="number" required />
						</div>
					</div>
					<div class="row">
						<div class="col-xs-4 col-md-4">
							<select class="form-control" name="tipo">
								<c:forEach var="tipo" items="${tipoImovel}">
									<option value="${tipo}">${tipo}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-xs-4 col-md-4">
							<select class="form-control" name="categoria">
								<c:forEach var="categoria" items="${categoriaImovel}">
									<option value="${categoria}">${categoria}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-xs-4 col-md-4">
							<label class="checkbox-inline" style="margin-top: 7px;"><input
								type="checkbox" name="disponivel">Disponível?</label>
						</div>
					</div>

					<div class="row">
						<div class="col-xs-6 col-md-6">
							<input class="form-control" name="areaUtil"
								placeholder="Área Útil m²" type="number" required />
						</div>
						<div class="col-xs-6 col-md-6">
							<input class="form-control" name="areaTotal"
								placeholder="Área Total m²" type="number" required />
						</div>
					</div>

					<div class="row">
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="qtdeDormitorio"
								placeholder="Quantidade de Dormitórios" type="number" required />
						</div>
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="qtdeSala"
								placeholder="Quantidade de Salas" type="number" required />
						</div>
						<div class="col-xs-4 col-md-4">
							<input class="form-control" name="qtdeBanheiro"
								placeholder="Quantidade de Banheiros" type="number" required />
						</div>
					</div>

					<div class="form-group">
						<label for="comment">Observação:</label>
						<textarea class="form-control" rows="2" name="observacao" id="observacao"></textarea>
					</div>

					<button class="btn btn-lg btn-primary btn-block" type="submit">
						Cadastrar!</button>
				</form>
			</div>
		</div>

		<!-- Footer -->
		<footer>
		<center>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Your Website 2014</p>
				</div>
			</div>
		</center>
		<!-- /.row --> </footer>

	</div>
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.mask.min.js" />"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#cep').mask('00000-000');
		});
	</script>
</body>
</html>