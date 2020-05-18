<div class="container">

    <!-- IMAGEN DEL LOGO -->
    <div class="navbar-header" style="width: 30%;height: 160px;">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <div class="logo" style="margin-top: 15px;margin-left: -70px;">
            <img src="<%=request.getContextPath()%>/img/logovillarreal.png" style="width: 80%;height: 120px;" >
        </div>
    </div>

    <!-- BARRA DE DESPLIEGUE -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

        <ul class="nav navbar-nav navbar-right">
            <li class="active">
                <a href="#">Principal</a>
            </li> 
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="">Mi Información <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#">Perfil</a>
                    </li>
                    <li>
                        <a href="#">Contraseña</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#"><img src="">Apertura Plan de Estudios</a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="">Mantenimiento<b class="caret"></b></a>
                <ul class="dropdown-menu">
                	<li>
                        <a href="#">Facultades</a>
                    </li>
                    <li>
                        <a href="#">Escuelas</a>
                    </li>
                    <li>
                        <a href="#">Matrícula</a>
                    </li>
                    <li>
                        <a href="#">Calificaciones</a>
                    </li>
                    <li>
                        <a href="javascript:evalua()">Plan de Estudios</a>
                    </li>
                    <li>
                        <a href="#">Ciclos</a>
                    </li>
                    <li>
                        <a href="#">Cursos</a>
                    </li>
                </ul>
            </li> 
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="">Personal<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#">Usuarios</a>
                    </li>
                    <li>
                        <a href="#">Administradores</a>
                    </li>
                    <li>
                        <a href="#">Docentes</a>
                    </li>
                    <li>
                        <a href="#">Alumnos</a>
                    </li>
                </ul>
            </li>           
            <li>
                <a href="javascript:mensajeAlerta()" ><img src="">Cerrar Sesion </a>
            </li>
        </ul>
    </div>
</div>


	
                