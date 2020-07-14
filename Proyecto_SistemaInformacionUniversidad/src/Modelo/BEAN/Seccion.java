package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="SECCION")
public class Seccion {

	@Id
	@Column(name="COD_SECCION")
	private String codSeccion;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="CUPOS")
	private int cupos;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_CURSO")
	private Curso cursoFKSeccion;
	
	@OneToMany(mappedBy="seccionFKMatricula",cascade=CascadeType.ALL)
	private List<Matricula> listaMatricula;
	
	public void listarMatriculas(Matricula mat) {
		if(listaMatricula==null)
			listaMatricula=new ArrayList<Matricula>();
		listaMatricula.add(mat);
		mat.setSeccionFKMatricula(this);
	}
	
	public Seccion() {}

	public Seccion(String codSeccion, String nombre, int cupos) {
		this.codSeccion = codSeccion;
		this.nombre = nombre;
		this.cupos = cupos;
	}

	@Override
	public String toString() {
		return "Seccion [codSeccion=" + codSeccion + ", nombre=" + nombre + ", cupos=" + cupos + "]";
	}

	public Curso getCursoFKSeccion() {
		return cursoFKSeccion;
	}

	public void setCursoFKSeccion(Curso cursoFKSeccion) {
		this.cursoFKSeccion = cursoFKSeccion;
	}

	public String getCodSeccion() {
		return codSeccion;
	}

	public void setCodSeccion(String codSeccion) {
		this.codSeccion = codSeccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}

}
