package com.github.yjj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;

import com.github.yjj.entity.Client;
import com.github.yjj.entity.Diffusion;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("reservation")

public class ReservationDto implements Serializable {
	
	
	private int idResa;
	
	private String qrImage;

	private String categorie;
	
	private String numPlace;
	
	private boolean status;
	
	private String createdAt;
	
	private Diffusion diffusion;
	
	private Client client;
	
	public ReservationDto() {
		
	}
	
	


	public ReservationDto(int idResa, String qrImage, String categorie, String numPlace, boolean status, String createdAt,
			Diffusion diffusion, Client client) {
		super();
		this.idResa = idResa;
		this.qrImage = qrImage;
		this.categorie = categorie;
		this.numPlace = numPlace;
		this.status = status;
		this.createdAt = createdAt;
		this.diffusion = diffusion;
		this.client = client;
	}
	
	




	public ReservationDto(int idResa, String qrImage, String categorie, String numPlace, boolean status, String createdAt) {
		super();
		this.idResa = idResa;
		this.qrImage = qrImage;
		this.categorie = categorie;
		this.numPlace = numPlace;
		this.status = status;
		this.createdAt = createdAt;
	}




	public ReservationDto(String qrImage, String categorie, String numPlace, boolean status, String createdAt,
			Diffusion diffusion, Client client) {
		super();
		this.qrImage = qrImage;
		this.categorie = categorie;
		this.numPlace = numPlace;
		this.status = status;
		this.createdAt = createdAt;
		this.diffusion = diffusion;
		this.client = client;
	}




	public int getIdResa() {
		return idResa;
	}


	public void setIdResa(int idResa) {
		this.idResa = idResa;
	}


	public String getQrImage() {
		return qrImage;
	}


	public void setQrImage(String qrImage) {
		this.qrImage = qrImage;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getNumPlace() {
		return numPlace;
	}


	public void setNumPlace(String numPlace) {
		this.numPlace = numPlace;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	public Diffusion getDiffusion() {
		return diffusion;
	}


	public void setDiffusion(Diffusion diffusion) {
		this.diffusion = diffusion;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
