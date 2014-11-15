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
	margin-top: 50px;
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
					<a href="#"><i class="glyphicon glyphicon-globe"></i></a>
					Cadastre-se!
				</legend>
				<form action="#" method="post" class="form" role="form">
					<div class="row">
						<div class="col-xs-12">
							<input class="form-control" name="nome"
								placeholder="Nome Completo" type="text" required autofocus />
						</div>
					</div>
					<input class="form-control" name="email" placeholder="Email"
						type="email" /> <input class="form-control" name="senha"
						placeholder="Senha" type="password" /> <input
						class="form-control" name="confirmacaoSenha"
						placeholder="Confirme sua senha" type="password" /> <label for="">
						Birth Date</label>
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<input type="text" class="form-control" value=""
								placeholder="dd/MM/yyyy" id="datepicker">
						</div>
					</div>
					<label class="radio-inline"> <input type="radio"
						name="sexo" id="inlineCheckbox1" value="masculino" /> Masculino
					</label> <label class="radio-inline"> <input type="radio"
						name="sex" id="inlineCheckbox2" value="feminino" /> Feminino
					</label> <br /> <br />
					<button class="btn btn-lg btn-primary btn-block" type="submit">
						Sign up</button>
				</form>
			</div>
		</div>
	</div>
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap-datepicker.js" />"></script>
	<script type="text/javascript">
		$('#datepicker').datepicker().on('changeDate', function(ev) {
			$('#datepicker').datepicker('hide');
		})
	</script>
</body>
</html>