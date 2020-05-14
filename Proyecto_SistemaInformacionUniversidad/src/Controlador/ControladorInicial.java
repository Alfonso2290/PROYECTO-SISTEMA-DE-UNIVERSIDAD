package Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorInicial {

	@RequestMapping
	public String inicioSesion() {
		return "index";
	}
}
