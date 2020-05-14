<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Inicio de Sesión</title>
		
		<!-- Básicos -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
		
		<!-- Páginas web -->
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
		
		<!-- Creados -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/style-login.css">
		<script type="text/javascript" src="<%=request.getContextPath()%>/js-app/login.js"></script>
		
	</head>
	<body>
		<div class="container">
	        <div class="card card-container">
	            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
	            <p id="profile-name" class="profile-name-card"></p>
	            <form class="form-signin">
	                <span id="reauth-email" class="reauth-email"></span>
	                <select name="cbTipo" class="form-control" required autofocus>
	                	<option value="--Seleccione Tipo de Usuario--">--Seleccione Tipo de Usuario--</option>
	                	<option value="Administrador">Administrador</option>
	                	<option value="Alumno">Alumno</option>
	                	<option value="Docente">Docente</option>
	                </select>
	                <br/>
	                <input type="text" id="nome" class="form-control" placeholder="Usuario" required autofocus>
	                <input type="password" id="senha" class="form-control" placeholder="Contraseña" required>
	                <div id="remember" class="checkbox">
	                    <label>
	                        <input type="checkbox" value="remember-me"> Recordar contraseña
	                    </label>
	                </div>
	                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
	            </form><!-- /form -->
	            <a href="#" class="forgot-password">
	                Registrarse?
	            </a>
	        </div>
	    </div>
	</body>
</html>
