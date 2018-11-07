package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")

public class Bill {
	
	@Id
	@Column(name="codigoFactura")
	@GeneratedValue
	private String code;
	
	@Id
	@Column(name="factura")
	@GeneratedValue
	private double invoice;
	
	@Id
	@Column(name="tipoPagoFactura")
	@GeneratedValue
	private String typepayment;
	
	@Id
	@Column(name="valor")
	@GeneratedValue
	private double value;
	
	@Id
	@Column(name="descuento")
	@GeneratedValue
	private double discount;
	
	public Bill() {
		super();
	}
	public Bill(String code, double innovaice, String typepayment, double value, double discount) {
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
