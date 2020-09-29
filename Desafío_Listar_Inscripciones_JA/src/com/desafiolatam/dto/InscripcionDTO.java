package com.desafiolatam.dto;

public class InscripcionDTO {
	
	private int idInsc;
	private String nombre;
	private String clave;
	private String rol;
	private String celular;
	private int idCurso;
	private int idFormaDePago;
	
	

	public InscripcionDTO() {
		super();
	}
	
	public InscripcionDTO(int idInsc, String nombre, String clave, String rol, String celular, int idCurso,
			int idFormaDePago) {
		super();
		this.idInsc = idInsc;
		this.nombre = nombre;
		this.clave = clave;
		this.rol = rol;
		this.celular = celular;
		this.idCurso = idCurso;
		this.idFormaDePago = idFormaDePago;
	}



	public int getIdInsc() {
		return idInsc;
	}



	public void setIdInsc(int idInsc) {
		this.idInsc = idInsc;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public int getIdCurso() {
		return idCurso;
	}



	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}



	public int getIdFormaDePago() {
		return idFormaDePago;
	}



	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}



	@Override
	public String toString() {
		return "Inscrispci�nDTO [idInsc=" + idInsc + ", nombre=" + nombre + ", clave=" + clave + ", rol=" + rol
				+ ", ceclular=" + celular + ", idCurso=" + idCurso + ", idFormaDePago=" + idFormaDePago + "]";
	}






}
