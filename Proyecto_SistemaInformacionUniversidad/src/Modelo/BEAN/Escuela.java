package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="ESCUELA")
public class Escuela {

	@Id
	@Column(name="COD_ESCUELA")
	private String codEscuela;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FECHA_FUNDACION")
	private Date fechaFundacion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_FACULTAD")
	private Facultad FacultadFKEscuela;
	
	@OneToMany(mappedBy="escuelaFKMallaCurricular",cascade=CascadeType.ALL)
	private List<MallaCurricular> listaMallaCurricular;
	
	public void listarMallaCurriculares(MallaCurricular malla) {
		if(listaMallaCurricular==null)
			listaMallaCurricular=new ArrayList<MallaCurricular>();
		listaMallaCurricular.add(malla);
		malla.setEscuelaFKMallaCurricular(this);
	}
	
	@OneToMany(mappedBy="escuelaFKMatricula",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Matricula> listaMatricula;
	
	public void listarMatriculas(Matricula mat) {
		if(listaMatricula==null)
			listaMatricula=new ArrayList<Matricula>();
		listaMatricula.add(mat);
		mat.setEscuelaFKMatricula(this);
	}
	
	@OneToMany(mappedBy="escuelaFKContrato",cascade=CascadeType.ALL)
	private List<Contrato> listaContrato;
	
	public void listarContratos(Contrato cont) {
		if(listaContrato==null)
			listaContrato=new ArrayList<Contrato>();
		listaContrato.add(cont);
		cont.setEscuelaFKContrato(this);
	}
	
	public Escuela() {}

	public Escuela(String codEscuela, String nombre, Date fechaFundacion) {
		this.codEscuela = codEscuela;
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
	}

	@Override
	public String toString() {
		return "Escuela [codEscuela=" + codEscuela + ", nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + "]";
	}

	public Facultad getFacultadFKEscuela() {
		return FacultadFKEscuela;
	}

	public void setFacultadFKEscuela(Facultad facultadFKEscuela) {
		FacultadFKEscuela = facultadFKEscuela;
	}

	public String getCodEscuela() {
		return codEscuela;
	}

	public void setCodEscuela(String codEscuela) {
		this.codEscuela = codEscuela;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

}
