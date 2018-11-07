package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Payment {
	@Id
	@Column(name="codigoPago")
	@GeneratedValue
	private String code;
	
	@Id
	@Column(name="factura")
	@GeneratedValue
	private String invoice;
	
	@Id
	@Column(name="tipoPago")
	@GeneratedValue
	private String typepayment;
	
	@Id
	@Column(name="descuento")
	@GeneratedValue
	private double descount;
	
	@Id
	@Column(name="valor")
	@GeneratedValue
	private double value;
	
	public Payment() {
		super();
	}
	public Payment(String code, String invoice, String typepayment, double descount, double value) {
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
