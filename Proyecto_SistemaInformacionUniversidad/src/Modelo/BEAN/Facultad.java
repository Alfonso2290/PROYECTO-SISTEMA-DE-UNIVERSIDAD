package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="FACULTAD")
public class Facultad {

	@Id
	@Column(name="COD_FACULTAD")
	private String codFacultad;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FECHA_FUNDACION")
	private Date fechaFundacion;

	@OneToMany(mappedBy="FacultadFKEscuela",cascade=CascadeType.ALL)
	private List<Escuela> listaEscuela;
	
	public void listarEscuelas(Escuela esc) {
		if(listaEscuela==null)
			listaEscuela=new ArrayList<Escuela>();
		listaEscuela.add(esc);
		esc.setFacultadFKEscuela(this);
	}
	
	public Facultad() {}

	public Facultad(String codFacultad, String nombre, Date fechaFundacion) {
		this.codFacultad = codFacultad;
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
	}

	@Override
	public String toString() {
		return "Facultad [codFacultad=" + codFacultad + ", nombre=" + nombre + ", fechaFundacion=" + fechaFundacion
				+ "]";
	}

	public String getCodFacultad() {
		return codFacultad;
	}

	public void setCodFacultad(String codFacultad) {
		this.codFacultad = codFacultad;
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
