<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Cadastro de Cliente</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
	type="img/ico" />

<style type="text/css">
body {
	margin-top: 30px;
	background-image: url('<c:url value="/resources/img/city.jpg" />')
		!important;
	background-size: cover !important;
	background-image: url('<c:url value="/resources/img/city.jpg" />')
		!important;
}

.form-control {
	margin-bottom: 10px;
}
</style>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-xs-12 col-sm-12 col-md-8 well well-sm">
				<legend>
					<a href="/mobil/"><img class="logo" title="Home"
				alt="Logo" src="<c:url value="/resources/img/house.png" />"></a>
					Cadastre-se!
				</legend>
				<form class="form" method="POST" action="adicionaCliente">
					<div class="row">
						<div class="col-xs-12">
							<input class="form-control" name="nome"
								placeholder="Nome Completo" type="text" required autofocus />
						</div>
					</div>
					<input class="form-control" name="email" placeholder="Email"
						type="email" required />
					
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<input type="text" class="form-control" value="" name="dataNascimento"
								placeholder="Data de Nascimento" id="datepicker" required >
						</div>
					</div>
					
					<input class="form-control" name="senha" placeholder="Senha" type="password" required /> 
					<input class="form-control" name="cpf" id="cpf" placeholder="CPF" type="text" required />
					<input class="form-control" name="telResidencial" id="telResidencial" placeholder="Telefone Residencial" type="text" required />
					<input class="form-control" name="telCelular" id="telCelular" placeholder="Telefone Celular" type="text" required />
					
					<div class="radio">
						<label class="radio-inline"> <input type="radio"
							name="sexo" id="masculino" value="masculino" checked>
							Masculino
						</label> <label class="radio-inline"> <input type="radio"
							name="sexo" id="feminino" value="feminino">
							Feminino
						</label>
					</div>

					<br /> <br />
					<button class="btn btn-lg btn-primary btn-block" type="submit">
						Cadastrar!</button>
				</form>
			</div>
		</div>
		
		<!-- Footer -->
		<footer>
		<center>
			<div class="row" style="color: white;">
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
			$('#datepicker').mask('00/00/0000');
			$('#cpf').mask('000.000.000-00');
			$('#telResidencial').mask('(00) 0000-0000');
			$('#telCelular').mask('(00) 0 0000-0000');
		});

		$('#datepicker').datepicker({
			format : 'dd/mm/yyyy'
		}).on('changeDate', function(ev) {
			$('#datepicker').datepicker('hide');
		})
	</script>
</body>
</html>