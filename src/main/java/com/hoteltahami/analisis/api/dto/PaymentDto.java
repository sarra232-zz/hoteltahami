package com.hoteltahami.analisis.api.dto;

public class PaymentDTO {
	private String code;
	private String invoice;
	private String typepayment;
	private double descount;
	private double value;
	
	public PaymentDTO() {
		super();
	}
	public PaymentDTO(String code, String invoice, String typepayment, double descount, double value) {
		super();
		this.code = code;
		this.invoice = invoice;
		this.typepayment = typepayment;
		this.descount = descount;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getTypepayment() {
		return typepayment;
	}
	public void setTypepayment(String typepayment) {
		this.typepayment = typepayment;
	}
	public double getDescount() {
		return descount;
	}
	public void setDescount(double descount) {
		this.descount = descount;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
