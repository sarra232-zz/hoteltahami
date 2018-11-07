package com.hoteltahami.analisis.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")

public class Person {
	@Id
	@Column(name="documento")
	@GeneratedValue
	private String typeDoc;
	
	@Id
	@Column(name="identificacion")
	@GeneratedValue
	private String id;
	
	@Id
	@Column(name="nombre")
	@GeneratedValue
	private String name;
	
	@Id
	@Column(name="apellido")
	@GeneratedValue
	private String lastname;
	
	@Id
	@Column(name="sexo")
	@GeneratedValue
	private String sex;
	
	@Id
	@Column(name="telefono")
	@GeneratedValue
	private String telephone;
	
	@Id
	@Column(name="direccion")
	@GeneratedValue
	private String address;
	
	@Id
	@Column(name="email")
	@GeneratedValue
	private String email;
	
	@Id
	@Column(name="contraseña")
	@GeneratedValue
	private String password;
	
	public Person() {
		super();
	}
	public Person(String t_doc, String id, String name, String lastname, String sex, String telephone, String address, String email,
			String password) {
		super();
		this.typeDoc = t_doc;
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
		this.telephone = telephone;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public String getTypeDoc() {
		return typeDoc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
