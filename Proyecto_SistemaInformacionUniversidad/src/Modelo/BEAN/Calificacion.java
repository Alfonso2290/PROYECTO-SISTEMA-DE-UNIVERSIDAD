package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="CALIFICACION")
public class Calificacion {

	@Id
	@Column(name="COD_CALIFICACION")
	private String codCalificacion;
	
	@Column(name="EXAMEN_PARCIAL")
	private double ep;
	
	@Column(name="EXAMEN_FINAL")
	private double ef;
	
	@Column(name="PROMEDIO_PRACTICAS")
	private double pp;
	
	@Column(name="PROMEDIO_FINAL")
	private double pf;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_DOCENTE")
	private Docente docenteFKCalificacion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_CURSO")
	private Curso cursoFKCalificacion;
	
	public Calificacion() {}

	public Calificacion(String codCalificacion, double ep, double ef, double pp, double pf) {
		this.codCalificacion = codCalificacion;
		this.ep = ep;
		this.ef = ef;
		this.pp = pp;
		this.pf = pf;
	}

	@Override
	public String toString() {
		return "Calificacion [codCalificacion=" + codCalificacion + ", ep=" + ep + ", ef=" + ef + ", pp=" + pp + ", pf="
				+ pf + "]";
	}

	public String getCodCalificacion() {
		return codCalificacion;
	}

	public void setCodCalificacion(String codCalificacion) {
		this.codCalificacion = codCalificacion;
	}

	public double getEp() {
		return ep;
	}

	public void setEp(double ep) {
		this.ep = ep;
	}

	public double getEf() {
		return ef;
	}

	public void setEf(double ef) {
		this.ef = ef;
	}

	public double getPp() {
		return pp;
	}

	public void setPp(double pp) {
		this.pp = pp;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public Docente getDocenteFKCalificacion() {
		return docenteFKCalificacion;
	}

	public void setDocenteFKCalificacion(Docente docenteFKCalificacion) {
		this.docenteFKCalificacion = docenteFKCalificacion;
	}

	public Curso getCursoFKCalificacion() {
		return cursoFKCalificacion;
	}

	public void setCursoFKCalificacion(Curso cursoFKCalificacion) {
		this.cursoFKCalificacion = cursoFKCalificacion;
	}

}
