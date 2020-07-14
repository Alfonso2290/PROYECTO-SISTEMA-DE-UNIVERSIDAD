<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registro de Usuario</title>
	</head>
	<body>
		<div class="container">
			<div class="row">
		    <div class="col col-md-5" style="margin-left:30%;width:40%;margin-top:5%;" >
				<div class="modal-content" >
		    			<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="ajax('cerrarSesion','','contenedor','GET')">
								×
							</button>
							<h4 class="modal-title">
								Crear Cuenta
							</h4>
						</div>
						<div class="modal-body">
							<form novalidate="novalidate" id="formSignUp">
								<div id="errorSignUp">
								
								</div>
								
								<div class="form-group">
									<label class="control-label">Tipo de Usuario</label>
									<div class="input-group">
										<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
										<select class="form-control" name="cbTipo">
											<option value="--Seleccione Tipo de Usuario--">--Seleccione Tipo de Usuario--</option>
						                	<option value="Administrador">Administrador</option>
						                	<option value="Alumno">Alumno</option>
						                	<option value="Docente">Docente</option>
										</select>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label">Usuario</label>
									<div class="input-group">
										<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
										<input class="form-control" placeholder="Usuario" name="emailSignUp" id="emailSignUp" type="email">
									</div>
								</div>
									
								<div class="form-group">
									<label class="control-label" for="password">Contraseña</label>
									<div class="input-group">
										<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
										<input class="form-control" placeholder="Contraseña" name="passwordSignUp" id="passwordSignUp" type="password">
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label" for="password">Confirmar Contraseña</label>
									<div class="input-group">
										<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
										<input class="form-control" placeholder="Confirmar Contraseña" name="passwordConfirmSignUp" id="passwordConfirmSignUp" type="password">
									</div>
								</div>

								<button type="submit" id="btnSignUp" class="btn btn-primary" style="width: 127px;">Crear Cuenta</button>
							</form>
						</div>
					</div>
		        </div>
			</div>
		</div>
	</body>
</html>