package Modelo.BEAN;

import javax.persistence.*;

@Entity
@Table(name="PROFESION_ALUMNO")
public class ProfesionAlumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROFESION_ALUMNO")
	private int codProfesionAlumno;
	
	@Column(name="GRADO_ACADEMICO")
	private String gradoAcademico;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_ALUMNO")
	private Alumno AlumnoFKProfesionAlumno;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COD_PROFESION")
	private Profesion ProfesionFKProfesionAlumno;
	
	public ProfesionAlumno() {}

	public ProfesionAlumno(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	@Override
	public String toString() {
		return "ProfesionAlumno [codProfesionAlumno=" + codProfesionAlumno + ", gradoAcademico=" + gradoAcademico + "]";
	}

	public Alumno getAlumnoFKProfesionAlumno() {
		return AlumnoFKProfesionAlumno;
	}

	public void setAlumnoFKProfesionAlumno(Alumno alumnoFKProfesionAlumno) {
		AlumnoFKProfesionAlumno = alumnoFKProfesionAlumno;
	}

	public Profesion getProfesionFKProfesionAlumno() {
		return ProfesionFKProfesionAlumno;
	}

	public void setProfesionFKProfesionAlumno(Profesion profesionFKProfesionAlumno) {
		ProfesionFKProfesionAlumno = profesionFKProfesionAlumno;
	}

	public int getCodProfesionAlumno() {
		return codProfesionAlumno;
	}

	public void setCodProfesionAlumno(int codProfesionAlumno) {
		this.codProfesionAlumno = codProfesionAlumno;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

}
