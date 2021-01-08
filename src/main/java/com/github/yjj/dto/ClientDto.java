package com.github.yjj.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;
import org.hibernate.annotations.GenericGenerator;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("client")

public class ClientDto {

	
	private String idClient;
	
	
	private String nom;
	
	
	private String prenom;
	
	
	private String email;
	
	
	private String telephone;
	
	
	private String password;
	
	private String confirmCode;
	
	
	private String createdAt;

	public ClientDto(String idClient, String nom, String prenom, String email,String telephone, String password, String confirmCode,
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
