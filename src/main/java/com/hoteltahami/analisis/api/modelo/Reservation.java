package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservacion")
public class Reservation {
	
	@Id
	@Column(name="codigoReserva")
	@GeneratedValue
	private String code;
	
	@Id
	@Column(name="espacioReserva")
	@GeneratedValue
	private String space;
	
	@Id
	@Column(name="fechaEntrada")
	@GeneratedValue
	private String dateentry; //Revisar
	
	@Id
	@Column(name="fechaSalida")
	@GeneratedValue
	private String dateout;   // revisar el tipo de dato
	
	@Id
	@Column(name="cliente")
	@GeneratedValue
	private String client;
	
	@Id
	@Column(name="estadoReserva")
	@GeneratedValue
	private Boolean status;
	
	public Reservation() {
		super();
		
	}
	public Reservation(String code, String spice, String dateentry, String dateout, String client, Boolean status) {
		super();
		this.code = code;
		this.space = spice;
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
		return space;
	}
	public void setSpice(String spice) {
		this.space = spice;
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
