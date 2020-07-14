package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="CONTRATO_DIAS_LABORALES")
public class ContratoDiasLaborales {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_CONTRATO_DIA_LABORAL")
	private int codContratoDiaLaboral;
	
	@Column(name="HORARIO")
	private String horario;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_CONTRATO")
	private Contrato contratoFKContratoDiasLaborales;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_DIA_LABORAL")
	private DiasLaborales diasLaboralesFKContratoDiasLaborales;
	
	public ContratoDiasLaborales() {}

	public ContratoDiasLaborales(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "ContratoDiasLaborales [codContratoDiaLaboral=" + codContratoDiaLaboral + ", horario=" + horario + "]";
	}

	public int getCodContratoDiaLaboral() {
		return codContratoDiaLaboral;
	}

	public void setCodContratoDiaLaboral(int codContratoDiaLaboral) {
		this.codContratoDiaLaboral = codContratoDiaLaboral;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Contrato getContratoFKContratoDiasLaborales() {
		return contratoFKContratoDiasLaborales;
	}

	public void setContratoFKContratoDiasLaborales(Contrato contratoFKContratoDiasLaborales) {
		this.contratoFKContratoDiasLaborales = contratoFKContratoDiasLaborales;
	}

	public DiasLaborales getDiasLaboralesFKContratoDiasLaborales() {
		return diasLaboralesFKContratoDiasLaborales;
	}

	public void setDiasLaboralesFKContratoDiasLaborales(DiasLaborales diasLaboralesFKContratoDiasLaborales) {
		this.diasLaboralesFKContratoDiasLaborales = diasLaboralesFKContratoDiasLaborales;
	}

}
