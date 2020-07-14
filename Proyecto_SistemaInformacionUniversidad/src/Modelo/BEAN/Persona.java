package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="PERSONA")
public class Persona {
	
	@Id
	@Column(name="DNI")
	private String dni;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO_PAT")
	private String apellidoPat;

	@Column(name="APELLIDO_MAT")
	private String apellidoMat;
	
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
	@Column(name="SEXO")
	private String sexo;
	
	@Column(name="EDAD")
	private int edad;
	
	@Column(name="TELEFONO_FIJO")
	private String telefonoFijo;
	
	@Column(name="TELEFONO_CELULAR")
	private String telefonoCelular;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="COD_DEPARTAMENTO")
	private Departamento departamentoFKPersona;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="COD_PROVINCIA")
	private Provincia provinciaFKPersona;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="COD_DISTRITO")
	private Distrito distritoFKPersona;
	
	@OneToMany(mappedBy="personaFKUsuario",cascade=CascadeType.ALL)
	private List<Usuario> listaUsuario;
	
	public void listarUsuarios(Usuario usu) {
		if (listaUsuario==null)
			listaUsuario=new ArrayList<Usuario>();
		listaUsuario.add(usu);
		usu.setPersonaFKUsuario(this);
	}
	
	@OneToMany(mappedBy="personaFKAdministrador",cascade=CascadeType.ALL)
	private List<Administrador> listaAdministrador;
	
	public void listarAdministradores(Administrador adm) {
		if (listaAdministrador==null)
			listaAdministrador=new ArrayList<Administrador>();
		listaAdministrador.add(adm);
		adm.setPersonaFKAdministrador(this);
	}
	
	@OneToMany(mappedBy="personaFKAlumno",cascade=CascadeType.ALL)
	private List<Alumno> listaAlumno;
	
	public void listarAlumnos(Alumno alu) {
		if(listaAlumno==null)
			listaAlumno=new ArrayList<Alumno>();
		listaAlumno.add(alu);
		alu.setPersonaFKAlumno(this);
	}
	
	@OneToMany(mappedBy="personaFKDocente",cascade=CascadeType.ALL)
	private List<Docente> listaDocente;
	
	public void listarDocentes(Docente doc) {
		if(listaDocente==null)
			listaDocente=new ArrayList<Docente>();
		listaDocente.add(doc);
		doc.setPersonaFKDocente(this);
	}

	public Persona() {}

	public Persona(String dni, String nombre, String apellidoPat, String apellidoMat, Date fechaNacimiento, String sexo,
			int edad, String telefonoFijo, String telefonoCelular, String email, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.edad = edad;
		this.telefonoFijo = telefonoFijo;
		this.telefonoCelular = telefonoCelular;
		this.email = email;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidoPat=" + apellidoPat + ", apellidoMat="
				+ apellidoMat + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", edad=" + edad
				+ ", telefonoFijo=" + telefonoFijo + ", telefonoCelular=" + telefonoCelular + ", email=" + email
				+ ", direccion=" + direccion + "]";
	}

	public Departamento getDepartamentoFKPersona() {
		return departamentoFKPersona;
	}

	public void setDepartamentoFKPersona(Departamento departamentoFKPersona) {
		this.departamentoFKPersona = departamentoFKPersona;
	}

	public Provincia getProvinciaFKPersona() {
		return provinciaFKPersona;
	}

	public void setProvinciaFKPersona(Provincia provinciaFKPersona) {
		this.provinciaFKPersona = provinciaFKPersona;
	}

	public Distrito getDistritoFKPersona() {
		return distritoFKPersona;
	}

	public void setDistritoFKPersona(Distrito distritoFKPersona) {
		this.distritoFKPersona = distritoFKPersona;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}

