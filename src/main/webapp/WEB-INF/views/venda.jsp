<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Mobil - Venda</title>
  <link href="<c:url value="/resources/css/bootstrap.min.css" />"
        rel="stylesheet">
  <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
  <link rel="icon" href="<c:url value="/resources/img/favicon.ico" />"
        type="img/ico"/>
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
        <li class="active"><a href="/mobil/venda">Venda</a></li>
        <li><a href="/mobil/locacao">Locação</a></li>
        <li><a href="/mobil/imoveis-proximos">Imóveis Próximos</a></li>
        <c:if test="${usuarioLogado != null}">
          <li class="dropdown"><a href="#" class="dropdown-toggle"
                                  data-toggle="dropdown"> <c:set var="nome"
                                                                 value="${fn:split(usuarioLogado.nome, ' ')}"/>
            Olá,
              ${nome[0]}! <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="#">Action</a></li>
              <li><a href="#">Another action</a></li>
              <li><a href="#">Something else here</a></li>
              <li class="divider"></li>
              <li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
            </ul>
          </li>
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

<c:if test="${usuarioLogado == null}">
  <div class="jumbotron">
    <center>
      <h1 style="color: #fff">Bem vindo ao Mobil!</h1>

      <h3 style="color: #fff">O lugar perfeito para encontrar seu
        imóvel!</h3>
      <br> <a href="/mobil/cadastro" class="btn btn-primary">Cadastre-se
      »</a>
    </center>
  </div>
</c:if>
<c:if test="${usuarioLogado != null}">
  <br/><br/><br/><br/>
</c:if>

<!-- Page Content -->
<div class="container-fluid">

  <!-- Projects Row -->
  <div class="row-fluid">
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-ok"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-ok"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-ok"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-ok"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
    <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 portfolio-item">
      <img class="img-responsive img-rounded"
           src="http://placehold.it/250x200" alt="">

      <div class="favorito">
        <button type="button" class="btn btn-sm btn-primary btn-block"><i class="glyphicon glyphicon-star"></i>
        </button>
      </div>
    </div>
  </div>
  <!-- /.row -->

  <hr>

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
<!-- /.container -->

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script
        src="<c:url value="/resources/js/jquery.contenthover.min.js" />"></script>
</body>
</html>