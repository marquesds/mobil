<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobil - Home</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
	type="img/ico" />
</head>
<body>
	<nav class="navbar-inverse navbar-custom" role="navigation">
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

		<!-- Collect the nav links, forms, and other content for toggling -->
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown">Olá, Usuário! <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="#">Action</a></li>
					<li><a href="#">Another action</a></li>
					<li><a href="#">Something else here</a></li>
					<li class="divider"></li>
					<li><a href="#">Separated link</a></li>
				</ul></li>
		</ul>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">Venda</a></li>
				<li><a href="#">Locação</a></li>
				<li><a href="#">Ofertas</a></li>
				<li><a href="#">Imóveis Próximos</a></li>
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

	<div class="jumbotron">
		<center>
			<h1 style="color: #fff">Bem vindo ao Mobil!</h1>
			<h3 style="color: #fff">O lugar perfeito para encontrar seu
				imóvel!</h3>
			<br>
			<button type="submit" class="btn btn-primary">Cadastre-se »</button>
		</center>
	</div>

	<!-- Page Content -->
	<div class="container-fluid">

		<!-- Projects Row -->
		<div class="row">
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://upload.wikimedia.org/wikipedia/commons/c/c9/Ranch_style_home_in_Salinas,_California.JPG" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://hookedonhouses.net/wp-content/uploads/2009/01/Father-of-the-Bride-Lookalike-house.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://www.loghouse.fi/wp-content/uploads/2011/11/log-house-5.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://gencept.com/wp-content/uploads/2012/10/Beautiful-Houses-Week32_E4-House-by-DADA-Partners_01.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
		</div>
		<!-- /.row -->

		<!-- Projects Row -->
		<div class="row">
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://www.helenachow.com.au/wp-content/uploads/2013/12/Houses-For-Sale-in-Malvern.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://cdn.homedit.com/wp-content/uploads/2013/01/guz-architects-green-house.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://www.e-architect.co.uk/images/jpgs/melbourne/cloud_house_m230712_j14.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://www.arcspace.com/CropUp/-/media/753624/Aires-Mateus-Alcacer-do-Sal-Elderly-Houses-01.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
		</div>
		<!-- /.row -->

		<!-- Projects Row -->
		<div class="row">
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://media-cdn.tripadvisor.com/media/photo-s/03/4e/09/c3/heliotropia-houses.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://imganuncios.mitula.net/harmony_homes_kate_house_model_96635202838577040.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://alamai.com/wp-content/uploads/2014/07/architectural-styles-6773-Cool-House-Plans-Lovely-floor-plans-small-houses-Rustic-Style.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
			<div class="col-md-3 portfolio-item">
				<img class="img-responsive img-imovel"
					src="http://www.viralnova.com/wp-content/uploads/2014/04/fairy_tale_houses_01.jpg" alt="">
				<div class="contenthover">
					<h4>Lorem ipsum</h4>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas.</p>
					<p>
						<a href="#" class="mybutton">Lorem ipsum</a>
					</p>
				</div>
			</div>
		</div>
		<!-- /.row -->

		<hr>

		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; Your Website 2014</p>
			</div>
		</div>
		<!-- /.row --> </footer>

	</div>
	<!-- /.container -->

	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/jquery.contenthover.min.js" />"></script>
	<script type="text/javascript">
		$('.img-imovel').contenthover({
			effect : 'slide',
			slide_speed : 300,
			overlay_background : '#000',
			overlay_opacity : 0.8
		});
	</script>
</body>
</html>