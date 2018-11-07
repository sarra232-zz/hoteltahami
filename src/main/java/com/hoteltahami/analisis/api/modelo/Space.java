package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "espacio")
public class Space {
	
	@Id
	@Column(name="codigoEspacio")
	@GeneratedValue
	private String code;
	
	@Id
	@Column(name="nombreEspacio")
	@GeneratedValue
	private String name;
	
	@Id
	@Column(name="estadoEspacio")
	@GeneratedValue
	private Boolean status;
	
	@Id
	@Column(name="fechaFinal")
	@GeneratedValue
	private String finaldate;  //revisar el tipo de dato, por Date
	
	@Id
	@Column(name="fechaInicial")
	@GeneratedValue
	private String inicialdate;
	
	public Space() {
		super();
	
	}
	public Space(String code, String name, Boolean status, String finaldate, String inicialdate) {
		super();
		this.code = code;
		this.name = name;
		this.status = status;
		this.finaldate = finaldate;
		this.inicialdate = inicialdate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getFinaldate() {
		return finaldate;
	}
	public void setFinaldate(String finaldate) {
		this.finaldate = finaldate;
	}
	public String getInicialdate() {
		return inicialdate;
	}
	public void setInicialdate(String inicialdate) {
		this.inicialdate = inicialdate;
	}
	
	
}
