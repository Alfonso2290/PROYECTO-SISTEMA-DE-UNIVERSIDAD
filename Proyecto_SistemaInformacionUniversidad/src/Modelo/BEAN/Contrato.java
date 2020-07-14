package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="CONTRATO")
public class Contrato {

	@Id
	@Column(name="COD_CONTRATO")
	private String codContrato;
	
	@Column(name="SUELDO_CONTRATO")
	private double sueldoContrato;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_DOCENTE")
	private Docente docenteFKContrato;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_ESCUELA")
	private Escuela escuelaFKContrato;
	
	@OneToMany(mappedBy="contratoFKContratoDiasLaborales",cascade=CascadeType.ALL)
	private List<ContratoDiasLaborales> listaContratoDiasLaborales;
	
	public void listarContratoDiasLaborales(ContratoDiasLaborales cdl) {
		if(listaContratoDiasLaborales==null)
			listaContratoDiasLaborales=new ArrayList<ContratoDiasLaborales>();
		listaContratoDiasLaborales.add(cdl);
		cdl.setContratoFKContratoDiasLaborales(this);
	}
	
	public Contrato() {}

	public Contrato(String codContrato, double sueldoContrato) {
		this.codContrato = codContrato;
		this.sueldoContrato = sueldoContrato;
	}

	@Override
	public String toString() {
		return "Contrato [codContrato=" + codContrato + ", sueldoContrato=" + sueldoContrato + "]";
	}

	public String getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(String codContrato) {
		this.codContrato = codContrato;
	}

	public double getSueldoContrato() {
		return sueldoContrato;
	}

	public void setSueldoContrato(double sueldoContrato) {
		this.sueldoContrato = sueldoContrato;
	}

	public Docente getDocenteFKContrato() {
		return docenteFKContrato;
	}

	public void setDocenteFKContrato(Docente docenteFKContrato) {
		this.docenteFKContrato = docenteFKContrato;
	}

	public Escuela getEscuelaFKContrato() {
		return escuelaFKContrato;
	}

	public void setEscuelaFKContrato(Escuela escuelaFKContrato) {
		this.escuelaFKContrato = escuelaFKContrato;
	}

}
