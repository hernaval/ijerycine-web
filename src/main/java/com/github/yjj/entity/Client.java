package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="client")
public class Client implements Serializable {
	@Id
	@GeneratedValue(generator ="UUID")
	@GenericGenerator(name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator")
	private String idClient;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone",nullable=true)
	private String telephone;
	
	@Column(name="password", nullable=true)
	private String password;
	
	@Column(name="confirmCode",nullable=true)
	private String confirmCode;
	
	
	@Column(name="createdAt",nullable=true)
	private String createdAt;
	
	

	public Client() {
		super();
	}


	

	public Client(String idClient) {
		super();
		this.idClient = idClient;
	}




	public Client(String idClient, String nom, String prenom, String email,String telephone, String password, String confirmCode,
			String createdAt) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.confirmCode = confirmCode;
		this.createdAt = createdAt;
		this.telephone = telephone;
	}
	
	

	public Client(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}



	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	
	
	

}
