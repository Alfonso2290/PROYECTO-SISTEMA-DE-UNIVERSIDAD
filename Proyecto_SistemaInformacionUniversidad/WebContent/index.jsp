<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Inicio de Sesión</title>
		
		<!-- Básicos -->
		
		<!-- Páginas web -->
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
		
		<!-- Creados -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/style-login.css">
		<script type="text/javascript" src="<%=request.getContextPath()%>/js-app/login.js"></script>
	
		<!-- Menu Principal Alumno -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/HojaEstilo01.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/HojaEstilo03.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/HojaEstilo002.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/bootstrap.min2.css"> 
        <script type="text/javascript" src="<%=request.getContextPath()%>/js-app/jquery_3.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js-app/bootstrap.min5.js"></script>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/modern-business.css" >   
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css-app/style2.css" media="all" />
        <script type="text/javascript" src="<%=request.getContextPath()%>/js-app/jssor.slider-22.0.15.mini.js" data-library="jssor.slider.mini" data-version="22.0.15"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js-app/responsiveslides.min.js"></script>   
        <script type="text/javascript" src="<%=request.getContextPath()%>/js-app/jquery.flexisel.js"></script>	
		
		<script type="text/javascript">
			function mensajeAlerta(){ //luego borrar
				alert("Saliendo de sesion");
			}
			
			function evalua(){ //luego borrar
				alert("Malla curricular");
			}
			
			function ingresoSesion(url,parametro,id,tipo){
				
				var usuario=document.form.txtUsuario.value;
				var clave=document.form.txtClave.value;
				var tipoUsuario=document.form.cbTipo.value;
				
				if(tipoUsuario=="--Seleccione Tipo de Usuario--"){
					alert("Ud. debe seleccionar el Tipo de Usuario");
					document.form.cbTipo.focus();
					return;
				}else if(usuario==""){
					alert("Ud. debe llenar el campo Usuario");
					document.form.txtUsuario.focus();
					return;
				}else if(clave==""){
					alert("Ud. debe llenar el campo Contraseña");
					document.form.txtClave.focus();
					return;
				}else{
					var parametros="?txtUsuario=" + usuario + "&txtClave=" + clave + "&cbTipo=" + tipoUsuario;	
					ajax(url,parametros,id,tipo);
				}

			}
			
			function ajax(url,parametro,id,tipo){

				var pagina=url + parametro;
				var xmlhttp;
				
				if(window.XMLHttpRequest)
					xmlhttp=new XMLHttpRequest();
				else
					xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				
				xmlhttp.onreadystatechange=function (){
					
					if(xmlhttp.readyState==4 && xmlhttp.status==200)
						document.getElementById(id).innerHTML=xmlhttp.responseText;
				}
				
				xmlhttp.open(tipo,pagina,true);
				xmlhttp.send(null);
				
			}
		</script>
	</head>
	<body>
		<form name="form">
			<div class="container" id="contenedor">
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
		                <input type="text" id="nome" name="txtUsuario" class="form-control" placeholder="Usuario" required autofocus>
		                <br/>
		                <input type="password" id="senha" name="txtClave" class="form-control" placeholder="Contraseña" required>
		                <div id="remember" class="checkbox">
		                    <label>
		                        <input type="checkbox" value="remember-me"> Recordar contraseña
		                    </label>
		                </div>
		                <button style="font-size: 12pt;" class="btn btn-lg btn-primary btn-block btn-signin" type="button" onclick="ingresoSesion('MenuPrincipal','','contenedor','GET')">Entrar</button>
		            </form>
		            <a href="#" class="forgot-password">
		                Registrarse?
		            </a>
		        </div>
		    </div>
	    </form>
	</body>
</html>
