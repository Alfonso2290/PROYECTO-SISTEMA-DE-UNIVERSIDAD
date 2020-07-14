package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="PROVINCIA")
public class Provincia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROVINCIA")
	private int codProvincia;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_DEPARTAMENTO")
	private Departamento departamentoFK;
	
	@OneToMany(mappedBy="provinciaFK",cascade=CascadeType.ALL)
	List<Distrito> listaDistrito;
	
	public void listarDistritos(Distrito dis) {
		if(listaDistrito==null)
			listaDistrito=new ArrayList<Distrito>();
		listaDistrito.add(dis);
		dis.setProvinciaFK(this);
	}
	
	@OneToMany(mappedBy="provinciaFKPersona",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Persona> listaPersona;
	
	public void listarPersonas(Persona per) {
		if(listaPersona==null)
			listaPersona = new ArrayList<Persona>();
		listaPersona.add(per);
		per.setProvinciaFKPersona(this);
	}
	
	@OneToMany(mappedBy="provinciaFKUsuario",cascade= {CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	private List<Usuario> listaUsuario;
	
	public void listarUsuarios(Usuario usu) {
		if(listaUsuario==null)
			listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(usu);
		usu.setProvinciaFKUsuario(this);
	}

	public Provincia() {}

	public Provincia(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincia [codProvincia=" + codProvincia + ", nombre=" + nombre + "]";
	}

	public Departamento getDepartamentoFK() {
		return departamentoFK;
	}

	public void setDepartamentoFK(Departamento departamentoFK) {
		this.departamentoFK = departamentoFK;
	}

	public int getCodProvincia() {
		return codProvincia;
	}

	public void setCodProvincia(int codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
