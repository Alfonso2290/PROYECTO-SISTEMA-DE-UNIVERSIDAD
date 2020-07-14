package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorUsuario {

	@RequestMapping("MenuPrincipal")
	public String MenuPrincipal(HttpServletRequest request) {
		
		String usu=request.getParameter("txtUsuario");
		String cla=request.getParameter("txtClave");
		String tipo=request.getParameter("cbTipo");
		
		if(tipo.equals("Administrador")) {
			
			if(usu.equalsIgnoreCase("Alfonso") && cla.equals("123"))
				return "MenuPrincipalAdministrador";
			else 
				return "index";
			
		}else if (tipo.equals("Alumno")) {
			
			if(usu.equalsIgnoreCase("Alfonso") && cla.equals("123"))
				return "MenuPrincipalAlumno";
			else 
				return "index";
			
		}else if (tipo.equals("Docente")) {
			
			if(usu.equalsIgnoreCase("Alfonso") && cla.equals("123"))
				return "MenuPrincipalDocente";
			else 
				return "index";
			
		}else {
			return "";
		}
	}
	
	@RequestMapping("cerrarSesion")
	public String cerrarSesion() {
		return "index";
	}
	
	@RequestMapping("RegistroUsuario")
	public String RegistroUsuario() {
		return "RegistroUsuario";
	}
}
