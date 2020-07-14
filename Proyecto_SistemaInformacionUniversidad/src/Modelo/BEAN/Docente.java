package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="DOCENTE")
public class Docente {

	@Id
	@Column(name="COD_DOCENTE")
	private String codDocente;
	
	@Column(name="COBRO_HORA")
	private double cobroHora;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DNI")
	private Persona personaFKDocente;

	@OneToMany(mappedBy="DocenteFKProfesionDocente",cascade=CascadeType.ALL)
	private List<ProfesionDocente> listaProfesionDocente;
	
	public void listarProfesionDocente(ProfesionDocente profdoc) {
		if(listaProfesionDocente==null)
			listaProfesionDocente=new ArrayList<ProfesionDocente>();
		listaProfesionDocente.add(profdoc);
		profdoc.setDocenteFKProfesionDocente(this);
	}
	
	@OneToMany(mappedBy="docenteFKContrato",cascade=CascadeType.ALL)
	private List<Contrato> listaContrato;
	
	public void listarContratos(Contrato cont) {
		if(listaContrato==null)
			listaContrato=new ArrayList<Contrato>();
		listaContrato.add(cont);
		cont.setDocenteFKContrato(this);
	}
	
	@OneToMany(mappedBy="docenteFKCalificacion",cascade=CascadeType.ALL)
	private List<Calificacion> listaCalificacion;
	
	public void listarCalificaciones(Calificacion cal) {
		if(listaCalificacion==null)
			listaCalificacion=new ArrayList<Calificacion>();
		listaCalificacion.add(cal);
		cal.setDocenteFKCalificacion(this);
	}
	
	public Docente() {}

	public Docente(String codDocente, double cobroHora) {
		this.codDocente = codDocente;
		this.cobroHora = cobroHora;
	}

	@Override
	public String toString() {
		return "Docente [codDocente=" + codDocente + ", cobroHora=" + cobroHora + "]";
	}

	public Persona getPersonaFKDocente() {
		return personaFKDocente;
	}

	public void setPersonaFKDocente(Persona personaFKDocente) {
		this.personaFKDocente = personaFKDocente;
	}

	public String getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(String codDocente) {
		this.codDocente = codDocente;
	}

	public double getCobroHora() {
		return cobroHora;
	}

	public void setCobroHora(double cobroHora) {
		this.cobroHora = cobroHora;
	}
}
