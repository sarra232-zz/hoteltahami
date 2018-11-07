package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Employed extends Person{
	
	@Id
	@Column(name="rol")
	@GeneratedValue
	private String rol;
	
	@Id
	@Column(name="estadoEmpleado")
	@GeneratedValue
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
