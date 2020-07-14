package Modelo.BEAN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="PROFESION")
public class Profesion {

	@Id
	@Column(name="COD_PROFESION")
	private String codProfesion;
	
	@Column(name="NOMBRE",unique=true)
	private String nombre;

	@OneToMany(mappedBy="ProfesionFKProfesionAlumno",cascade=CascadeType.ALL)
	private List<ProfesionAlumno> listaProfesionAlumno;
	
	public void listarProfesionAlumno(ProfesionAlumno profalu) {
		if(listaProfesionAlumno==null)
			listaProfesionAlumno=new ArrayList<ProfesionAlumno>();
		listaProfesionAlumno.add(profalu);
		profalu.setProfesionFKProfesionAlumno(this);
	}
	
	@OneToMany(mappedBy="ProfesionFKProfesionDocente",cascade=CascadeType.ALL)
	private List<ProfesionDocente> listaProfesionDocente;
	
	public void listarProfesionDocente(ProfesionDocente profdoc) {
		if(listaProfesionDocente==null)
			listaProfesionDocente=new ArrayList<ProfesionDocente>();
		listaProfesionDocente.add(profdoc);
		profdoc.setProfesionFKProfesionDocente(this);
	}
	
	public Profesion() {}

	public Profesion(String codProfesion, String nombre) {
		this.codProfesion = codProfesion;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Profesion [codProfesion=" + codProfesion + ", nombre=" + nombre + "]";
	}

	public String getCodProfesion() {
		return codProfesion;
	}

	public void setCodProfesion(String codProfesion) {
		this.codProfesion = codProfesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
