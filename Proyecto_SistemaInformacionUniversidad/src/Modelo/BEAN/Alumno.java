package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="ALUMNO")
public class Alumno {

	@Id
	@Column(name="COD_ALUMNO")
	private String codAlumno;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DNI")
	private Persona personaFKAlumno;

	@OneToMany(mappedBy="AlumnoFKProfesionAlumno",cascade=CascadeType.ALL)
	private List<ProfesionAlumno> listaProfesionAlumno;
	
	public void listarProfesionAlumno(ProfesionAlumno profalu) {
		if(listaProfesionAlumno==null)
			listaProfesionAlumno=new ArrayList<ProfesionAlumno>();
		listaProfesionAlumno.add(profalu);
		profalu.setAlumnoFKProfesionAlumno(this);
	}
	
	@OneToMany(mappedBy="alumnoFKMatricula",cascade=CascadeType.ALL)
	private List<Matricula> listaMatricula;
	
	public void listarMatriculas(Matricula mat) {
		if(listaMatricula==null)
			listaMatricula=new ArrayList<Matricula>();
		listaMatricula.add(mat);
		mat.setAlumnoFKMatricula(this);
	}
	
	public Alumno() {}

	public Alumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [codAlumno=" + codAlumno + "]";
	}

	public Persona getPersonaFKAlumno() {
		return personaFKAlumno;
	}

	public void setPersonaFKAlumno(Persona personaFKAlumno) {
		this.personaFKAlumno = personaFKAlumno;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

}
