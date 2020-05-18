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
            <%@include file="./BarraMenuPrincipalAdministrador.jsp" %>    
            <div class="CabeceraMenus">Menú Principal - Administrador</div>
        </nav>
        <div id="contenedorAdministrador" style="margin-top:14%;">
        	<img src="<%=request.getContextPath()%>/img/img-admin.jpg" style="margin-left:10%;width:80%">
        </div>
        <br/>
	</body>
</html>