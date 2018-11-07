package com.hoteltahami.analisis.api.dto;

public class ReservationDTO {
	private String code;
	private String space;
	private String dateentry; //Revisar
	private String dateout;   // revisar el tipo de dato
	private String client;
	private Boolean status;
	
	public ReservationDTO() {
		super();
		
	}
	public ReservationDTO(String code, String space, String dateentry, String dateout, String client, Boolean status) {
		super();
		this.code = code;
		this.space = space;
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
	public String getSpace() {
		return space;
	}
	public void setSpace(String spice) {
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
