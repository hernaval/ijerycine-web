package com.github.yjj.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tarification")
public class Tarification implements Serializable {
	
	@Id
	@GeneratedValue
	private int idTarif;
	
	@Column(name="nomCategorie")
	private String nomCategorie;
	
	@Column(name="prix")
	private float prix;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diffusion_id") 
	private Diffusion diffusion;

	public Tarification(int idTarif, String nomCategorie, float prix, Diffusion diffusion) {
		super();
		this.idTarif = idTarif;
		this.nomCategorie = nomCategorie;
		this.prix = prix;
		this.diffusion = diffusion;
	}

	public Tarification(String nomCategorie, float prix, Diffusion diffusion) {
		super();
		this.nomCategorie = nomCategorie;
		this.prix = prix;
		this.diffusion = diffusion;
	}
	
	

	public Tarification(String nomCategorie, float prix) {
		super();
		this.nomCategorie = nomCategorie;
		this.prix = prix;
	}

	public int getIdTarif() {
		return idTarif;
	}

	public void setIdTarif(int idTarif) {
		this.idTarif = idTarif;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Diffusion getDiffusion() {
		return diffusion;
	}

	public void setDiffusion(Diffusion diffusion) {
		this.diffusion = diffusion;
	}
	
	
	
}
