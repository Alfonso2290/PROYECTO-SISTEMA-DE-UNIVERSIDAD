package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="DEPARTAMENTO")
public class Departamento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_DEPARTAMENTO")
	private int codDepartamento;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@OneToMany(mappedBy="departamentoFK",cascade=CascadeType.ALL)
	private List<Provincia> listaProvincia;
	
	public void listarProvincias(Provincia prov) {
		if(listaProvincia==null)
			listaProvincia = new ArrayList<Provincia>();
		listaProvincia.add(prov);
		prov.setDepartamentoFK(this);
	}
	
	@OneToMany(mappedBy="departamentoFoK",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Distrito> listaDistrito;
	
	public void listarDistritos(Distrito dis) {
		if(listaDistrito==null)
			listaDistrito = new ArrayList<Distrito>();
		listaDistrito.add(dis);
		dis.setDepartamentoFoK(this);
	}
	
	@OneToMany(mappedBy="departamentoFKPersona",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Persona> listaPersona;
	
	public void listarPersonas(Persona per) {
		if(listaPersona==null)
			listaPersona = new ArrayList<Persona>();
		listaPersona.add(per);
		per.setDepartamentoFKPersona(this);
	}
	
	@OneToMany(mappedBy="departamentoFKUsuario",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Usuario> listaUsuario;
	
	public void listarUsuarios(Usuario usu) {
		if(listaUsuario==null)
			listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(usu);
		usu.setDepartamentoFKUsuario(this);
	}
	
	public Departamento() {}

	public Departamento(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [codDepartamento=" + codDepartamento + ", nombre=" + nombre + "]";
	}

	public int getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
