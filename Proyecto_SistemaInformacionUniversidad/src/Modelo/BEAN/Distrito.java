package Modelo.BEAN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="DISTRITO")
public class Distrito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_DISTRITO")
	private int codDistrito;
	
	@Column(name="NOMBRE")
	private String nombre;

	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="COD_DEPARTAMENTO")
	private Departamento departamentoFoK;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_PROVINCIA")
	private Provincia provinciaFK;
	
	@OneToMany(mappedBy="distritoFKPersona",cascade= CascadeType.ALL)
	private List<Persona> listaPersona;
	
	public void listarPersonas(Persona per) {
		if(listaPersona==null)
			listaPersona = new ArrayList<Persona>();
		listaPersona.add(per);
		per.setDistritoFKPersona(this);
	}
	
	@OneToMany(mappedBy="distritoFKUsuario",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Usuario> listaUsuario;
	
	public void listarUsuarios(Usuario usu) {
		if(listaUsuario==null)
			listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(usu);
		usu.setDistritoFKUsuario(this);
	}
	
	public Distrito() {}

	public Distrito(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Distrito [codDistrito=" + codDistrito + ", nombre=" + nombre + "]";
	}
	
	public Provincia getProvinciaFK() {
		return provinciaFK;
	}

	public void setProvinciaFK(Provincia provinciaFK) {
		this.provinciaFK = provinciaFK;
	}

	public Departamento getDepartamentoFoK() {
		return departamentoFoK;
	}

	public void setDepartamentoFoK(Departamento departamentoFoK) {
		this.departamentoFoK = departamentoFoK;
	}

	public int getCodDistrito() {
		return codDistrito;
	}

	public void setCodDistrito(int codDistrito) {
		this.codDistrito = codDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
