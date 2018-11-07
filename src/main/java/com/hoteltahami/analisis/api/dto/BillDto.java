package com.hoteltahami.analisis.api.dto;


public class BillDTO {
	private String code;
	private double invoice;
	private String typepayment;
	private double value;
	private double discount;
	
	public BillDTO() {
		super();
	}
	public BillDTO(String code, double innovaice, String typepayment, double value, double discount) {
		super();
		this.code = code;
		this.invoice = innovaice;
		this.typepayment = typepayment;
		this.value = value;
		this.discount = discount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getInnovaice() {
		return invoice;
	}
	public void setInnovaice(double innovaice) {
		this.invoice = innovaice;
	}
	public String getTypepayment() {
		return typepayment;
	}
	public void setTypepayment(String typepayment) {
		this.typepayment = typepayment;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
