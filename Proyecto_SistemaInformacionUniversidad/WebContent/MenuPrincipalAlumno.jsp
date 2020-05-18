<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
      	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Menú Principal</title>
	</head>
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">  
            <%@include file="./BarraMenuPrincipalAlumno.jsp" %>    
            <div class="CabeceraMenus">Menú Principal - Alumno</div>
        </nav>
        <div id="contenedorAdministrador" style="margin-top:14%;">
        	<img src="<%=request.getContextPath()%>/img/img-alumno.jpg" style="margin-left:17%;width:66%">
        </div>
        <br/>
	</body>
</html>