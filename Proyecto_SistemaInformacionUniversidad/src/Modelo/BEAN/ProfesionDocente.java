package Modelo.BEAN;

import javax.persistence.*;

@Entity
@Table(name="PROFESION_DOCENTE")
public class ProfesionDocente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROFESION_DOCENTE")
	private int codProfesionDocente;
	
	@Column(name="GRADO_ACADEMICO")
	private String gradoAcademico;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_DOCENTE")
	private Docente DocenteFKProfesionDocente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_PROFESION")
	private Profesion ProfesionFKProfesionDocente;
	
	public ProfesionDocente() {}

	public ProfesionDocente(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	@Override
	public String toString() {
		return "ProfesionDocente [codProfesionDocente=" + codProfesionDocente + ", gradoAcademico=" + gradoAcademico
				+ "]";
	}

	public Docente getDocenteFKProfesionDocente() {
		return DocenteFKProfesionDocente;
	}

	public void setDocenteFKProfesionDocente(Docente docenteFKProfesionDocente) {
		DocenteFKProfesionDocente = docenteFKProfesionDocente;
	}

	public Profesion getProfesionFKProfesionDocente() {
		return ProfesionFKProfesionDocente;
	}

	public void setProfesionFKProfesionDocente(Profesion profesionFKProfesionDocente) {
		ProfesionFKProfesionDocente = profesionFKProfesionDocente;
	}

	public int getCodProfesionDocente() {
		return codProfesionDocente;
	}

	public void setCodProfesionDocente(int codProfesionDocente) {
		this.codProfesionDocente = codProfesionDocente;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
}
