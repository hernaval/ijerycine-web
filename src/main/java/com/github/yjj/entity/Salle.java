package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name="salle")
public class Salle implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSalle;
	
	@Column(name="nomSalle")
	private String nomSalle;
	
	@Column(name="nbPlace")
	private int nbPlace;
	
	
	@OneToMany(mappedBy = "salle")
	private Set<Diffusion> salleDiffusions = new HashSet();
	
	
	public Salle(){}

	

	public Salle(int idSalle, String nomSalle, int nbPlace) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
		this.nbPlace = nbPlace;
	}





	public Salle(String nomSalle) {
		super();
		this.nomSalle = nomSalle;
	}




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
	
	
	
	
	public int getNbPlace() {
		return nbPlace;
	}




	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}




	public Set<Diffusion> getSalleDiffusions() {
		return salleDiffusions;
	}


	@JsonProperty
	public void setSalleDiffusions(Set<Diffusion> salleDiffusions) {
		this.salleDiffusions = salleDiffusions;
	}
	
	public void addDiffusion(Diffusion diff){
		salleDiffusions.add(diff);
	}



	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", ]";
	}
	
	
	
	
}
