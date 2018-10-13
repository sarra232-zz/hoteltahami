package com.hoteltahami.analisis.api.modelo;

public class Spice {
	private String code;
	private String name;
	private Boolean status;
	private String finaldate;  //revisar el tipo de dato, por Date
	private String inicialdate;
	
	public Spice() {
		super();
	
	}
	public Spice(String code, String name, Boolean status, String finaldate, String inicialdate) {
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
