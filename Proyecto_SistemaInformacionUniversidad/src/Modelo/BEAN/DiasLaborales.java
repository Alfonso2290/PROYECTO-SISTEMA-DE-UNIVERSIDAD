package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="DIAS_LABORALES")
public class DiasLaborales {
	
	@Id
	@Column(name="COD_DIA_LABORAL")
	private int codDiaLaboral;
	
	@Column(name="COD_DIA_LABORAL")
	private String dia;
	
	@OneToMany(mappedBy="diasLaboralesFKContratoDiasLaborales",cascade=CascadeType.ALL)
	private List<ContratoDiasLaborales> listaContratoDiasLaborales;
	
	public void listarContratoDiasLaborales(ContratoDiasLaborales cdl) {
		if(listaContratoDiasLaborales==null)
			listaContratoDiasLaborales=new ArrayList<ContratoDiasLaborales>();
		listaContratoDiasLaborales.add(cdl);
		cdl.setDiasLaboralesFKContratoDiasLaborales(this);
	}
	
	public DiasLaborales() {}

	public DiasLaborales(int codDiaLaboral, String dia) {
		this.codDiaLaboral = codDiaLaboral;
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "DiasLaborales [codDiaLaboral=" + codDiaLaboral + ", dia=" + dia + "]";
	}

	public int getCodDiaLaboral() {
		return codDiaLaboral;
	}

	public void setCodDiaLaboral(int codDiaLaboral) {
		this.codDiaLaboral = codDiaLaboral;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
