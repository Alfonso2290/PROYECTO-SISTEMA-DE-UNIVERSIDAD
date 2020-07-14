package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="CURSO")
public class Curso {

	@Id
	@Column(name="COD_CURSO")
	private String codCurso;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="CREDITOS")
	private int creditos;
	
	@Column(name="CUPOS")
	private int cupos;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_CICLO")
	private Ciclo cicloFKCurso;
	
	@OneToMany(mappedBy="cursoFKSeccion",cascade=CascadeType.ALL)
	private List<Seccion> listaSeccion;
	
	public void listarSecciones(Seccion sec) {
		if(listaSeccion==null)
			listaSeccion=new ArrayList<Seccion>();
		listaSeccion.add(sec);
		sec.setCursoFKSeccion(this);
	}
	
	@OneToMany(mappedBy="cursoFKMatricula",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Matricula> listaMatricula;
	
	public void listarMatriculas(Matricula mat) {
		if(listaMatricula==null)
			listaMatricula=new ArrayList<Matricula>();
		listaMatricula.add(mat);
		mat.setCursoFKMatricula(this);
	}
	
	@OneToMany(mappedBy="cursoFKCalificacion",cascade=CascadeType.ALL)
	private List<Calificacion> listaCalificacion;
	
	public void listarCalificaciones(Calificacion cal) {
		if(listaCalificacion==null)
			listaCalificacion=new ArrayList<Calificacion>();
		listaCalificacion.add(cal);
		cal.setCursoFKCalificacion(this);
	}
	
	public Curso() {}

	public Curso(String codCurso, String nombre, int creditos, int cupos) {
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.creditos = creditos;
		this.cupos = cupos;
	}

	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", creditos=" + creditos + ", cupos=" + cupos
				+ "]";
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}

	public Ciclo getCicloFKCurso() {
		return cicloFKCurso;
	}

	public void setCicloFKCurso(Ciclo cicloFKCurso) {
		this.cicloFKCurso = cicloFKCurso;
	}

}
