package Modelo.BEAN;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="USUARIO")
public class Usuario {
	
	@Id
	@Column(name="COD_USUARIO")
	private String codUsuario;
	
	@Column(name="TIPO")
	private String tipo;

	@Column(name="NOMBRE_USUARIO",unique=true)
	private String nombreUsuario;
	
	@Column(name="CONTRASEÑA")
	private String contraseña;
	
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;
	
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
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DNI")
	private Persona personaFKUsuario;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="COD_DEPARTAMENTO")
	private Departamento departamentoFKUsuario;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="COD_PROVINCIA")
	private Provincia provinciaFKUsuario;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="COD_DISTRITO")
	private Distrito distritoFKUsuario;
	
	public Usuario() {}

	public Usuario(String codUsuario, String tipo, String nombreUsuario, String contraseña, Date fechaRegistro,
			String nombre, String apellidoPat, String apellidoMat, Date fechaNacimiento, String sexo, int edad,
			String telefonoFijo, String telefonoCelular, String email, String direccion) {
		this.codUsuario = codUsuario;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.fechaRegistro = fechaRegistro;
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

	public Usuario(String codUsuario, String tipo, String nombreUsuario, String contraseña, Date fechaRegistro) {
		this.codUsuario = codUsuario;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", tipo=" + tipo + ", nombreUsuario=" + nombreUsuario
				+ ", contraseña=" + contraseña + ", fechaRegistro=" + fechaRegistro + ", nombre=" + nombre
				+ ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat + ", fechaNacimiento="
				+ fechaNacimiento + ", sexo=" + sexo + ", edad=" + edad + ", telefonoFijo=" + telefonoFijo
				+ ", telefonoCelular=" + telefonoCelular + ", email=" + email + ", direccion=" + direccion + "]";
	}

	public Departamento getDepartamentoFKUsuario() {
		return departamentoFKUsuario;
	}

	public void setDepartamentoFKUsuario(Departamento departamentoFKUsuario) {
		this.departamentoFKUsuario = departamentoFKUsuario;
	}

	public Provincia getProvinciaFKUsuario() {
		return provinciaFKUsuario;
	}

	public void setProvinciaFKUsuario(Provincia provinciaFKUsuario) {
		this.provinciaFKUsuario = provinciaFKUsuario;
	}

	public Distrito getDistritoFKUsuario() {
		return distritoFKUsuario;
	}

	public void setDistritoFKUsuario(Distrito distritoFKUsuario) {
		this.distritoFKUsuario = distritoFKUsuario;
	}

	public Persona getPersonaFKUsuario() {
		return personaFKUsuario;
	}

	public void setPersonaFKUsuario(Persona personaFKUsuario) {
		this.personaFKUsuario = personaFKUsuario;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
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
