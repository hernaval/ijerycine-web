package com.github.yjj.dto;


import com.github.yjj.entity.Diffusion;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("reservation")
public class TarificationDto {
	
	private int idTarif;
	private String nomCategorie;
	private float prix;
	private Diffusion diffusion;
	
	
	public TarificationDto() {
		super();
	}
	public TarificationDto(int idTarif, String nomCategorie, float prix, Diffusion diffusion) {
		super();
		this.idTarif = idTarif;
		this.nomCategorie = nomCategorie;
		this.prix = prix;
		this.diffusion = diffusion;
	}
	public TarificationDto(String nomCategorie, float prix, Diffusion diffusion) {
		super();
		this.nomCategorie = nomCategorie;
		this.prix = prix;
		this.diffusion = diffusion;
	}
	
	
	public TarificationDto(String nomCategorie, float prix) {
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
