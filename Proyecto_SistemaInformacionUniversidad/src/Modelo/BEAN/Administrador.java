package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="ADMINISTRADOR")
public class Administrador {
	
	@Id
	@Column(name="COD_ADMINISTRADOR")
	private String codAdministrador;
	
	@Column(name="CARGO")
	private String cargo;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DNI")
	private Persona personaFKAdministrador;
	
	public Administrador() {}

	public Administrador(String codAdministrador, String cargo) {
		this.codAdministrador = codAdministrador;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Administrador [codAdministrador=" + codAdministrador + ", cargo=" + cargo + "]";
	}
	
	public Persona getPersonaFKAdministrador() {
		return personaFKAdministrador;
	}

	public void setPersonaFKAdministrador(Persona personaFKAdministrador) {
		this.personaFKAdministrador = personaFKAdministrador;
	}

	public String getCodAdministrador() {
		return codAdministrador;
	}

	public void setCodAdministrador(String codAdministrador) {
		this.codAdministrador = codAdministrador;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
