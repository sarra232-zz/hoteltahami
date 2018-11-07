package com.hoteltahami.analisis.api.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ProductDTO{
	private String code;
	private String name;
	private String description;
	private Boolean status;
	private double iva; //revisar
	private double pricesale;
	
	public ProductDTO() {
		super();
	}
	public ProductDTO(String code, String name, String description, Boolean status, double iva, double pricesale) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.status = status;
		this.iva = iva;
		this.pricesale = pricesale;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPricesale() {
		return pricesale;
	}
	public void setPricesale(double pricesale) {
		this.pricesale = pricesale;
	}
	
}
