package com.hoteltahami.analisis.api.modelo;

public class Reservation {
	private String code;
	private String spice;
	private String dateentry; //Revisar
	private String dateout;   // revisar el tipo de dato
	private String client;
	private Boolean status;
	
	public Reservation() {
		super();
		
	}
	public Reservation(String code, String spice, String dateentry, String dateout, String client, Boolean status) {
		super();
		this.code = code;
		this.spice = spice;
		this.dateentry = dateentry;
		this.dateout = dateout;
		this.client = client;
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSpice() {
		return spice;
	}
	public void setSpice(String spice) {
		this.spice = spice;
	}
	public String getDateentry() {
		return dateentry;
	}
	public void setDateentry(String dateentry) {
		this.dateentry = dateentry;
	}
	public String getDateout() {
		return dateout;
	}
	public void setDateout(String dateout) {
		this.dateout = dateout;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
