package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="MALLA_CURRICULAR")
public class MallaCurricular {

	@Id
	@Column(name="COD_MALLA")
	private String codMalla;
	
	@Column(name="CANTIDAD_CICLOS")
	private int cantidadCiclos;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_ESCUELA")
	private Escuela escuelaFKMallaCurricular;
	
	@OneToMany(mappedBy="mallaFKCiclo",cascade=CascadeType.ALL)
	private List<Ciclo> listaCiclo;
	
	public void listarCiclo(Ciclo ci) {
		if(listaCiclo==null)
			listaCiclo=new ArrayList<Ciclo>();
		listaCiclo.add(ci);
		ci.setMallaFKCiclo(this);
	}
	
	public MallaCurricular() {}

	public MallaCurricular(String codMalla, int cantidadCiclos) {
		this.codMalla = codMalla;
		this.cantidadCiclos = cantidadCiclos;
	}

	@Override
	public String toString() {
		return "MallaCurricular [codMalla=" + codMalla + ", cantidadCiclos=" + cantidadCiclos + "]";
	}

	public Escuela getEscuelaFKMallaCurricular() {
		return escuelaFKMallaCurricular;
	}

	public void setEscuelaFKMallaCurricular(Escuela escuelaFKMallaCurricular) {
		this.escuelaFKMallaCurricular = escuelaFKMallaCurricular;
	}

	public String getCodMalla() {
		return codMalla;
	}

	public void setCodMalla(String codMalla) {
		this.codMalla = codMalla;
	}

	public int getCantidadCiclos() {
		return cantidadCiclos;
	}

	public void setCantidadCiclos(int cantidadCiclos) {
		this.cantidadCiclos = cantidadCiclos;
	}

}
