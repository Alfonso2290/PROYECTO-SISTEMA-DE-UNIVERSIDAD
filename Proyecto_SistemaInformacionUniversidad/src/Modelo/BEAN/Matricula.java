package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="MATRICULA")
public class Matricula {

	@Id
	@Column(name="COD_MATRICULA")
	private String codMatricula;
	
	@Column(name="PAGO")
	private int pago;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_ALUMNO")
	private Alumno alumnoFKMatricula;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="COD_ESCUELA")
	private Escuela escuelaFKMatricula;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="COD_CICLO")
	private Ciclo cicloFKMatricula;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="COD_CURSO")
	private Curso cursoFKMatricula;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_SECCION")
	private Seccion seccionFKMatricula;
	
	public Matricula() {}

	public Matricula(String codMatricula, int pago) {
		this.codMatricula = codMatricula;
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Matricula [codMatricula=" + codMatricula + ", pago=" + pago + "]";
	}

	public String getCodMatricula() {
		return codMatricula;
	}

	public void setCodMatricula(String codMatricula) {
		this.codMatricula = codMatricula;
	}

	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	public Alumno getAlumnoFKMatricula() {
		return alumnoFKMatricula;
	}

	public void setAlumnoFKMatricula(Alumno alumnoFKMatricula) {
		this.alumnoFKMatricula = alumnoFKMatricula;
	}

	public Escuela getEscuelaFKMatricula() {
		return escuelaFKMatricula;
	}

	public void setEscuelaFKMatricula(Escuela escuelaFKMatricula) {
		this.escuelaFKMatricula = escuelaFKMatricula;
	}

	public Ciclo getCicloFKMatricula() {
		return cicloFKMatricula;
	}

	public void setCicloFKMatricula(Ciclo cicloFKMatricula) {
		this.cicloFKMatricula = cicloFKMatricula;
	}

	public Curso getCursoFKMatricula() {
		return cursoFKMatricula;
	}

	public void setCursoFKMatricula(Curso cursoFKMatricula) {
		this.cursoFKMatricula = cursoFKMatricula;
	}

	public Seccion getSeccionFKMatricula() {
		return seccionFKMatricula;
	}

	public void setSeccionFKMatricula(Seccion seccionFKMatricula) {
		this.seccionFKMatricula = seccionFKMatricula;
	}

}
