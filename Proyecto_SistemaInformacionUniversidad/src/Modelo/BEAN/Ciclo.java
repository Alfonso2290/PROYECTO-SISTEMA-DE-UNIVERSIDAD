package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="CICLO")
public class Ciclo {

	@Id
	@Column(name="COD_CICLO")
	private String codCiclo;
	
	@Column(name="NUMERO_CICLO")
	private int numeroCiclo;
	
	@Column(name="CANTIDAD_CURSOS")
	private int cantidadCursos;
	
	@Column(name="TOTAL_CREDITOS")
	private int totalCreditos;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_MALLA")
	private MallaCurricular mallaFKCiclo;
	
	@OneToMany(mappedBy="cicloFKCurso",cascade=CascadeType.ALL)
	private List<Curso> listaCurso;
	
	public void listarCursos(Curso cur) {
		if(listaCurso==null)
			listaCurso=new ArrayList<Curso>();
		listaCurso.add(cur);
		cur.setCicloFKCurso(this);
	}
	
	@OneToMany(mappedBy="cicloFKMatricula",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Matricula> listaMatricula;
	
	public void listarMatriculas(Matricula mat) {
		if(listaMatricula==null)
			listaMatricula=new ArrayList<Matricula>();
		listaMatricula.add(mat);
		mat.setCicloFKMatricula(this);
	}
	
	public Ciclo() {}

	public Ciclo(String codCiclo, int numeroCiclo, int cantidadCursos, int totalCreditos) {
		this.codCiclo = codCiclo;
		this.numeroCiclo = numeroCiclo;
		this.cantidadCursos = cantidadCursos;
		this.totalCreditos = totalCreditos;
	}

	@Override
	public String toString() {
		return "Ciclo [codCiclo=" + codCiclo + ", numeroCiclo=" + numeroCiclo + ", cantidadCursos=" + cantidadCursos
				+ ", totalCreditos=" + totalCreditos + "]";
	}

	public MallaCurricular getMallaFKCiclo() {
		return mallaFKCiclo;
	}

	public void setMallaFKCiclo(MallaCurricular mallaFKCiclo) {
		this.mallaFKCiclo = mallaFKCiclo;
	}

	public String getCodCiclo() {
		return codCiclo;
	}

	public void setCodCiclo(String codCiclo) {
		this.codCiclo = codCiclo;
	}

	public int getNumeroCiclo() {
		return numeroCiclo;
	}

	public void setNumeroCiclo(int numeroCiclo) {
		this.numeroCiclo = numeroCiclo;
	}

	public int getCantidadCursos() {
		return cantidadCursos;
	}

	public void setCantidadCursos(int cantidadCursos) {
		this.cantidadCursos = cantidadCursos;
	}

	public int getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(int totalCreditos) {
		this.totalCreditos = totalCreditos;
	}
}
