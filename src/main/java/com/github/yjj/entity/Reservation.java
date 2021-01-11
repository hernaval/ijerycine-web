package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable {
	
	@Id
	@GeneratedValue
	private int idResa;
	
	@Column(name="qrImage")
	private String qrImage;
	
	@Column(name="categorie")
	private String categorie;
	
	@Column(name="numPlace")
	private String numPlace;
	
	@Column(name="status")
	private boolean status;
	
	
	@Column(name="createdAt")
	private String createdAt;
	
	@ManyToOne
	private Diffusion diffusion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	
	
	public Reservation() {
		
	}
	
	


	public Reservation(int idResa, String qrImage, String categorie, String numPlace, boolean status, String createdAt,
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
	
	




	public Reservation(int idResa, String qrImage, String categorie, String numPlace, boolean status, String createdAt) {
		super();
		this.idResa = idResa;
		this.qrImage = qrImage;
		this.categorie = categorie;
		this.numPlace = numPlace;
		this.status = status;
		this.createdAt = createdAt;
	}




	public Reservation(String qrImage, String categorie, String numPlace, boolean status, String createdAt,
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


	@JsonProperty
	public void setDiffusion(Diffusion diffusion) {
		this.diffusion = diffusion;
	}


	
	public Client getClient() {
		return client;
	}


	 @JsonProperty
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

	
	
	
}
