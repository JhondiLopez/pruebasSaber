package com.parcialEmpresariales.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Estudiante {
	@Id
	private String id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String contrasena;
	private String correo;
	private String telefono;
	private String estado;
	private String numeroRegistro;
	private Double puntajeGlobal;
	private Double puntajeComunicacion;
	private Double puntajeRazonamiento;
	private Double puntajeLectura;
	private Double puntajeCiudadanas;
	private Double puntajeIngles;
	private Double puntajeFormulacion;
	private Double puntajePensamiento;
	private Double puntajeDiseno;
	private String nivelIngles;

	public Estudiante(String id, String nombre, String apellido, String cedula, String contrasena, String correo,
			String telefono, String estado, String numeroRegistro, Double puntajeGlobal, Double puntajeComunicacion,
			Double puntajeRazonamiento, Double puntajeLectura, Double puntajeCiudadanas, Double puntajeIngles,
			Double puntajeFormulacion, Double puntajePensamiento, Double puntajeDiseño, String nivelIngles) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.contrasena = contrasena;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.numeroRegistro = numeroRegistro;
		this.puntajeGlobal = puntajeGlobal;
		this.puntajeComunicacion = puntajeComunicacion;
		this.puntajeRazonamiento = puntajeRazonamiento;
		this.puntajeLectura = puntajeLectura;
		this.puntajeCiudadanas = puntajeCiudadanas;
		this.puntajeIngles = puntajeIngles;
		this.puntajeFormulacion = puntajeFormulacion;
		this.puntajePensamiento = puntajePensamiento;
		this.puntajeDiseno = puntajeDiseño;
		this.nivelIngles = nivelIngles;
	}

	public Estudiante() {
		this.puntajeGlobal = 0.0;
		this.puntajeComunicacion = 0.0;
		this.puntajeRazonamiento = 0.0;
		this.puntajeLectura = 0.0;
		this.puntajeCiudadanas = 0.0;
		this.puntajeIngles = 0.0;
		this.puntajeFormulacion = 0.0;
		this.puntajePensamiento = 0.0;
		this.puntajeDiseno = 0.0;
		this.nivelIngles = "0";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public Double getPuntajeGlobal() {
		return puntajeGlobal;
	}

	public void setPuntajeGlobal(Double puntajeGlobal) {
		this.puntajeGlobal = puntajeGlobal;
	}

	public Double getPuntajeComunicacion() {
		return puntajeComunicacion;
	}

	public void setPuntajeComunicacion(Double puntajeComunicacion) {
		this.puntajeComunicacion = puntajeComunicacion;
	}

	public Double getPuntajeRazonamiento() {
		return puntajeRazonamiento;
	}

	public void setPuntajeRazonamiento(Double puntajeRazonamiento) {
		this.puntajeRazonamiento = puntajeRazonamiento;
	}

	public Double getPuntajeLectura() {
		return puntajeLectura;
	}

	public void setPuntajeLectura(Double puntajeLectura) {
		this.puntajeLectura = puntajeLectura;
	}

	public Double getPuntajeCiudadanas() {
		return puntajeCiudadanas;
	}

	public void setPuntajeCiudadanas(Double puntajeCiudadanas) {
		this.puntajeCiudadanas = puntajeCiudadanas;
	}

	public Double getPuntajeIngles() {
		return puntajeIngles;
	}

	public void setPuntajeIngles(Double puntajeIngles) {
		this.puntajeIngles = puntajeIngles;
	}

	public Double getPuntajeFormulacion() {
		return puntajeFormulacion;
	}

	public void setPuntajeFormulacion(Double puntajeFormulacion) {
		this.puntajeFormulacion = puntajeFormulacion;
	}

	public Double getPuntajePensamiento() {
		return puntajePensamiento;
	}

	public void setPuntajePensamiento(Double puntajePensamiento) {
		this.puntajePensamiento = puntajePensamiento;
	}

	public Double getPuntajeDiseno() {
		return puntajeDiseno;
	}

	public void setPuntajeDiseno(Double puntajeDiseno) {
		this.puntajeDiseno = puntajeDiseno;
	}

	public String getNivelIngles() {
		return nivelIngles;
	}

	public void setNivelIngles(String nivelIngles) {
		this.nivelIngles = nivelIngles;
	}
	
}
