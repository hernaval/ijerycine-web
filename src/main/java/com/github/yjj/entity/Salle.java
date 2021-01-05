package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="salle")
public class Salle implements Serializable {
	
	@Id
	@GeneratedValue
	private int idSalle;
	
	@Column(name="nomSalle")
	private String nomSalle;
	
	/*@OneToMany(mappedBy = "salle")
	private Collection<Diffusion> salleDiffusions;*/
	
	
	public Salle(){}

	

	public Salle(int idSalle, String nomSalle) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
	}
	
	

	public int getIdSalle() {
		return idSalle;
	}



	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}



	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}



	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", ]";
	}
	
	
	
	
}
