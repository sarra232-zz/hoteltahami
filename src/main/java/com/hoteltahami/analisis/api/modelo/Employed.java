package com.hoteltahami.analisis.api.modelo;

public class Employed extends Person{
	private String rol;
	private Boolean status;
	
	public Employed() {
		super();
		
	}
	
	public Employed(String rol, Boolean status) {
		super();
		this.rol = rol;
		this.status = status;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
